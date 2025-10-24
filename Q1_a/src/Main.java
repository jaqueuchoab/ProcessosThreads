public class Main {
    public static void main(String args[]) {
        Racer racer = new Racer(3);
        Thread racerThread = new Thread(racer);
        racerThread.start();
    }
}

