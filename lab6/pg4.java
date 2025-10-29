
class TeaMaker implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Raju (TeaMaker) is making tea: " + i);
        }
    }
}


class Server implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Sita (Server) is serving customers: " + i);
        }
    }
}

class Cleaner implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Mohan (Cleaner) is cleaning: " + i);
        }
    }
}

public class pg4 {
    public static void main(String[] args) {
        // Create Runnable objects (the tasks)
        TeaMaker teaTask = new TeaMaker();
        Server serveTask = new Server();
        Cleaner cleanTask = new Cleaner();

        // Give each task a Thread to run on
        Thread t1 = new Thread(teaTask);
        Thread t2 = new Thread(serveTask);
        Thread t3 = new Thread(cleanTask);

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
   

// output
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass> cd "c:\Users\soura\OneDrive\Desktop\study\java\ass\lab6\" ; if ($?) { javac pg4.java } ; if ($?) { java pg4 }
//  Raju (TeaMaker) is making tea: 1
//  Sita (Server) is serving customers: 1
//  Mohan (Cleaner) is cleaning: 1
//  Sita (Server) is serving customers: 2
//  Raju (TeaMaker) is making tea: 2
//  Sita (Server) is serving customers: 3
//  Mohan (Cleaner) is cleaning: 2
//  Raju (TeaMaker) is making tea: 3
//  Mohan (Cleaner) is cleaning: 3
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> 
