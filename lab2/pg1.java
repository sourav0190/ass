class Box {
    double width;
    double height;
    double depth;

    void volume() {
        double vol = width * height * depth;
        System.out.println("Volume of the box is: " + vol);
    }
}

// Main class
public class pg1 {
    public static void main(String[] args) {
        // Create first Box instance
        Box box1 = new Box();
        box1.width = 3.0;
        box1.height = 4.0;
        box1.depth = 5.0;

        // Create second Box instance
        Box box2 = new Box();
        box2.width = 6.0;
        box2.height = 2.0;
        box2.depth = 3.0;

        // Compute and print volumes
        System.out.print("Box 1 ");
        box1.volume();

        System.out.print("Box 2 ");
        box2.volume();
    }
}
