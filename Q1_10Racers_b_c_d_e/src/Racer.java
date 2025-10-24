public class Racer implements Runnable {
    private int threadIndex;
    // criar um identificador que apareça na impressão de cada corredor

    Racer(int i) {
        threadIndex = i;
    }

    public void run() {
        while(true) {
            System.out.println("Racer " + threadIndex + "- imprimindo...");
            try {
                // Indicando que a thread vai "dormir por 200 milissegundos"
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


