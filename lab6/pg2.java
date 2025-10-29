public class pg2 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();  
        System.out.println("Current thread: " + t);
    }
}
// output
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> cd "c:\Users\soura\OneDrive\Desktop\study\java\ass\lab6\" ; if ($?) { javac pg2.java } ; if ($?) { java pg2 }
// Current thread: Thread[#3,main,5,main]
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> 