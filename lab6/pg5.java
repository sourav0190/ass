class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
        }
    }
}

public class pg5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Student");
        MyThread t2 = new MyThread("Class Monitor");
        MyThread t3 = new MyThread("Principal");

      
        t1.setPriority(Thread.NORM_PRIORITY);  // 5
        t2.setPriority(Thread.MAX_PRIORITY - 2); // 8
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
// Because thread scheduling depends on the OS, not just priority — priority only 
// suggests which thread should run first, but the CPU may still run lower-priority
//  threads first.
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass> cd "c:\Users\soura\OneDrive\Desktop\study\java\ass\lab6\" ; if ($?) { javac pg5.java } ; if ($?) { java pg5 }
// Student is running with priority 5
// Class Monitor is running with priority 8
// Principal is running with priority 10
// Class Monitor is running with priority 8
// Student is running with priority 5
// Principal is running with priority 10
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> 