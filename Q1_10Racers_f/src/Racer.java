public class Racer implements Runnable {
    private int threadIndex;
    // criar um identificador que apareça na impressão de cada corredor

    Racer(int i) {
        threadIndex = i;
    }

    public void run() {
        for(int i = 1; i <= 1000; i++) {
            System.out.println("Racer " + threadIndex + "- imprimindo... | " + i);
        }
    }
}


