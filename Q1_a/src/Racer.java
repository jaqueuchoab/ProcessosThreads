public class Racer implements Runnable {
    private int threadIndex;

    Racer(int i) {
        threadIndex = i;
    }

    public void run() {
        while(true) {
            System.out.println("Racer " + threadIndex + "- imprimindo...");
            threadIndex++;
        }
    }
}



