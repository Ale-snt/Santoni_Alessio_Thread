/**
 * Thread che simula la cucitura delle borse.
 *
 * <p>Questa classe rappresenta la fase di cucitura, successiva
 * al taglio del tessuto ma avviabile in parallelo in ambiente multithreading.</p>
 *
 * @author  Alessio Santoni
 * @version 1.0
 * @since   2025-11-14
 */
public class CucitoreBorse extends Thread {

    /**
     * Esegue la simulazione della cucitura.
     *
     * <p>Stampa un messaggio di avvio, attende l'intervallo di tempo per
     * la lavorazione e comunica il termine dell'operazione.</p>
     *
     * @throws InterruptedException Se il thread viene interrotto durante la pausa.
     */
    @Override
    public void run() {
        System.out.println("Inizio a cucire le borse");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finito di cucire le borse");
    }
}