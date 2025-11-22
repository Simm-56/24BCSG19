/* Q7.	Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities[use this keyword].*/

class Box {
    private double width, height, depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }
    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + volume());
    }
}
 class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5.0, 3.0, 2.0);
        box1.display();
		System.out.println("The volume of the box is: " +box1.volume() );
    }
}
