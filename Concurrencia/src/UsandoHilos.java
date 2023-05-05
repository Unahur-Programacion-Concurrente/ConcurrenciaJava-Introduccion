public class UsandoHilos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread a = new HiloConHerencia("hilo 1\n");
        Thread b = new HiloConHerencia("Hilo 2\n");
        a.start();
        b.start();

    /*    try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
        HiloConRunnable c = new HiloConRunnable("Hilo 3\n");
        HiloConRunnable d = new HiloConRunnable("Hilo 4\n");
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();

        Thread tA = new Thread(() -> System.out.println('A'), "hiloA");
        Thread tB = new Thread(HiloConLambda::printB, "hiloB");

        tA.start();
        tB.start();

        System.out.println("Fin del hilo principal");
    }


}

