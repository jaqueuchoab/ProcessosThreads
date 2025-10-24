public class Produtor implements Runnable {
    Deposito deposito;
    int time_sleep;

    public Produtor(Deposito dep, int time) {
        deposito = dep;
        time_sleep = time;
    }

    public void run() {
        // Produção de caixas
        for (int i = 1; i <= 100; i++) {
            if(deposito.colocar()) {
                System.out.println("PRODUZINDO  " + i + "° vez" + " | Add +1\n");
            } else {
                System.out.println("CAPACIDADE ATINGIDA");
            }

            try {
                Thread.sleep(time_sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

