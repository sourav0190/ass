public class Pg2 {
    double width;
    double height;
    double depth;

    // Method to calculate and return the volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create two box objects
        Pg2 box1 = new Pg2();
        Pg2 box2 = new Pg2();

        // Assign dimensions to box1
        box1.width = 10.0;
        box1.height = 5.0;
        box1.depth = 2.5;

        // Assign dimensions to box2
        box2.width = 7.5;
        box2.height = 3.0;
        box2.depth = 6.0;

        // Get volumes and print
        System.out.println("Volume of box1 is: " + box1.volume());
        System.out.println("Volume of box2 is: " + box2.volume());
    }
}
