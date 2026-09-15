/* NAME : SIMRAN SAHOO   SEC : B2
   SIC : 24BCSG19        ROLL NO : 13
   DATE : 1st SEP 2026
*/

#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netdb.h>
#include<signal.h>
#include<netinet/in.h>
#include<unistd.h>
#include<string.h>
#include<arpa/inet.h>
#define TRUE 1

int main(int argc, char *argv[]){
	int soc, chpid,msgsock;
	socklen_t len;
	char buf[1024],buf1[1024];
	struct sockaddr_in server, client;
	socklen_t addrlen=sizeof(client);
	// portno = 5001;

	/* first call to socke() funtion */
	soc = socket(AF_INET, SOCK_STREAM, 0);

	if (soc < 0){
		perror("ERROR opening socket");
		exit(1);
	}

	// ---Configure setting of the server address structure-----
	//Initialize socket structure elements to zero
	  //bzero((char *) &srv_addr, sizeof(serv_addr));
	// Set Address family = Internet
	    server.sin_family = AF_INET;
	// Set IP address to localhost 
	    //serv_addr.sin_addr.s_addr = INADDR_ANY;
	    server.sin_addr.s_addr = inet_addr("127.0.0.1");
	// Set port number, using htons function to use proper byte order
	    //serv_addr.sin_port = htons(portno);
	    server.sin_port = htons(atoi(argv[1]));

	    if ( connect(soc,(struct sockaddr *)&server,sizeof(server)) < 0){
		    perror("\nError in connection...");
		    exit(2);
	    }
	    do{
		    printf("\nClient input: ");
		    scanf(" %[^\n]",buf);
		    write(soc,buf,1024);
		    printf("\n");
		    read(soc,buf1,1024);
		    printf("\nMessage from server: %s",buf1);
	    }while(strcmp(buf,"bye")!=0);
	    return 0;
}

