
class CallDemo {
    int data = 50;

    // Call by Value
    void callByValue(int x) {
        x = x + 100; // changes won't affect actual argument
        System.out.println("Inside callByValue: " + x);
    }

    // Call by Reference
    void callByReference(CallDemo obj) {
        obj.data = obj.data + 100; // changes reflect outside
    }
}

public class pg8 {
    public static void main(String[] args) {
        CallDemo d = new CallDemo();

        System.out.println("Before callByValue: " + d.data);
        d.callByValue(d.data);
        System.out.println("After callByValue: " + d.data);

        System.out.println("\nBefore callByReference: " + d.data);
        d.callByReference(d);
        System.out.println("After callByReference: " + d.data);
    }
}
