public class Deposito {
    private int items = 0;
    private final int capacidade = 100;

    public int getNumItens(){
        return items;
    }

    public boolean retirar() {
       if(getNumItens() > 0) {
           items = getNumItens() - 1;
           return true;
       }
       return false;
    }
    public boolean colocar() {
        if(getNumItens() < 100) {
            items = getNumItens() +1;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Deposito dep = new Deposito();

        Produtor produtor = new Produtor(dep, 50);
        Thread produtorThread = new Thread(produtor);

        Consumidor c1 = new Consumidor(dep, 150, 1);
        Thread c1Thread = new Thread(c1);

        Consumidor c2 = new Consumidor(dep, 100, 2);
        Thread c2Thread = new Thread(c2);

        Consumidor c3 = new Consumidor(dep, 150, 3);
        Thread c3Thread = new Thread(c3);

        Consumidor c4 = new Consumidor(dep, 100, 4);
        Thread c4Thread = new Thread(c4);

        Consumidor c5 = new Consumidor(dep, 150, 5);
        Thread c5Thread = new Thread(c5);

        //Startar o produtor
        produtorThread.start();

        //Startar os consumidores.
        c1Thread.start(); c2Thread.start();
        c3Thread.start(); c4Thread.start(); c5Thread.start();

        System.out.println("Execução Terminada");
    }
}

