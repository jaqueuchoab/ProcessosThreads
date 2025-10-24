public class Consumidor implements Runnable  {
    Deposito deposito;
    int consumidor;
    int time_sleep;

    public Consumidor(Deposito dep, int time, int consumidor_id) {
        deposito = dep;
        time_sleep = time;
        consumidor = consumidor_id;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if(deposito.retirar()) {
                System.out.println("CONSUMIDOR("  + consumidor + ") "+ i + "° vez\n");
            } else {
                System.out.println("QTDE INSUFICIENTE - CONSUMIDOR (" + consumidor +  ") ESPERA UM POUCO");
                // Instrução adicionada para satisfazer a Q3
                try {
                    Thread.sleep(200);
                    if(deposito.retirar()) {
                        System.out.println("CONSUMIDOR("  + consumidor + ") "+ i + "° vez" + " | JÁ TENTOU\n");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                Thread.sleep(time_sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i == 20) {
                System.out.println("CONSUMIDOR (" + consumidor + ") FINALIZOU!");
            }
        }
    }
}

