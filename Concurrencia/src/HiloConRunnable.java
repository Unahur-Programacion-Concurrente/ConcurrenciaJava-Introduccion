public class HiloConRunnable implements Runnable {
    String mensaje;

    public HiloConRunnable(String _mensaje) {
        mensaje = _mensaje;
    }

    public void run() {
        for (int i=0; i<10 ; i++) {
            System.out.print(mensaje);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
