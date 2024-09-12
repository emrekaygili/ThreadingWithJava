public class KronometreThreading implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThreading(String threadName) {
        this.threadName = threadName;
        System.out.println(" Oluşturuluyor : "  + threadName );
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : " + threadName );

        //STANDART KOD
        try {
            for (int i = 0; i<10; i++) {
                System.out.println(threadName + " : " + i );
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception) {
            System.out.println("Kesildi : " + threadName );
            }

        System.out.println("Thread Sonlandı : " + threadName );
        }


        //STANDART KOD
        public void start() {
        System.out.println("Thread  nesnesi oluşuyor");
        if (thread == null) {}
        thread = new Thread(this, threadName);
        thread.start();
        }
}






