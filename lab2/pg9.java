
class Example {
    static int count;
    int id;

  
    static {
        count = 100;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    Example(int id) {
        this.id = id;
        count++;
    }

    void display() {
        System.out.println("ID: " + id + " | Count: " + count);
    }
}

public class pg9 {
    public static void main(String[] args) {
        Example e1 = new Example(1);
        Example e2 = new Example(2);

        e1.display();
        e2.display();
    }
}
