class TeaMaker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Raju (TeaMaker) is making tea: " + i);
        }
    }
}

class Server extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Sita (Server) is serving customers: " + i);
        }
    }
}

class Cleaner extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Mohan (Cleaner) is cleaning: " + i);
        }
    }
}

public class pg3 {
    public static void main(String[] args) {
        TeaMaker raju = new TeaMaker();
        Server sita = new Server();
        Cleaner mohan = new Cleaner();

        // Start all threads together
        raju.start();
        sita.start();
        mohan.start();
    }
}
// output

// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> cd "c:\Users\soura\OneDrive\Desktop\study\java\ass\lab6\" ; if ($?) { javac pg3.java } ; if ($?) { java pg3 }
//  Sita (Server) is serving customers: 1
//  Sita (Server) is serving customers: 2
//  Raju (TeaMaker) is making tea: 1
//  Mohan (Cleaner) is cleaning: 1
//  Raju (TeaMaker) is making tea: 2
//  Sita (Server) is serving customers: 3
//  Raju (TeaMaker) is making tea: 3
//  Mohan (Cleaner) is cleaning: 2
//  Mohan (Cleaner) is cleaning: 3
