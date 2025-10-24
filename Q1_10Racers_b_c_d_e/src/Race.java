public class Race {
    public void create() {
        System.out.println("RACE - START");
        for(int i = 1; i <= 10; i++){
            Racer racer = new Racer(i);
            Thread racerThread = new Thread(racer);
            // Para que a mudança usando o setPriority() seja percebida vou definir a prioridade
            // apenas para as que tem o i par. E se não for vai ter uma prioridade menor...
            if(i%2 == 0) {
                racerThread.setPriority(6);
            } else {
                racerThread.setPriority(2);
            }
            racerThread.start();
        }
    }
}
