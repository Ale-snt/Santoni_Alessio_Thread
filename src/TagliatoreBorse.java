/**
 * Thread che simula il taglio del tessuto per la produzione di borse.
 *
 * <p>Questa classe rappresenta una fase della catena produttiva:
 * il taglio del materiale. L'esecuzione prevede un messaggio iniziale,
 * una pausa {@code Thread.sleep()}, e un messaggio conclusivo.</p>
 *
 * @author  Alessio Santoni
 * @version 1.0
 * @since   2025-11-14
 */

class TagliatoreBorse extends Thread {

    /**
     * Metodo che avvia il processo di taglio del tessuto
     *
     * <p>Stampa un messaggio iniziale, attende un intervallo che simula il lavoro,
     * e comunica il completamento dell'operazione.</p>
     *
     * @throws InterruptedException Se il thread viene interrotto durante la pausa
     */
    @Override
    public void run() {
        System.out.println("Inizio a tagliare il tessuto delle borse");
        try {
            Thread.sleep(1000); // Simula il tempo di lavoro
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finito di tagliare il tessuto delle borse");
    }
}