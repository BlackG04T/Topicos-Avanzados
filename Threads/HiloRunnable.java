public class HiloRunnable {
    public static void main(String[] args) {
        Hilo tareaHilo = new Hilo();
        Thread miHilo = new Thread(tareaHilo);

        miHilo.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Hilo Main");
    }
}

    class Hilo implements Runnable{
        @Override
        public void run(){
            hazAlgo();
        }

        public void hazAlgo(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            hazAlgoMas();
        }

        public void hazAlgoMas(){
            System.out.println("Hilo Tarea");
        }
    }

