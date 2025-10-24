import java.util.ArrayList;
import java.util.List;

public class Race {
    public void create() {
        System.out.println("RACE - START");

        // Lista que vai guardar as threads impares
        List<Thread> impThreads = new ArrayList<>();

        // Criando e iniciando threads pares
        for (int i = 1; i <= 10; i += 2) {
            Racer racer = new Racer(i);
            Thread racerThread = new Thread(racer);
            racerThread.start();
            // Adicionando Thread a lista
            impThreads.add(racerThread);
        }

        // Percorrendo lista de threads impares e aplicando o join()
        for (Thread t : impThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Lista que vai guardar as threads pares
        List<Thread> parThreads = new ArrayList<>();

        // Criando e iniciando threads pares
        for (int i = 2; i <= 10; i += 2) {
            Racer racer = new Racer(i);
            Thread racerThread = new Thread(racer);
            racerThread.start();
            // Adicionando Thread a lista
            parThreads.add(racerThread);
        }

        // Percorrendo lista de threads pares e aplicando o join()
        for (Thread t : parThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
