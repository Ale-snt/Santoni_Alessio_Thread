class Main {

    /**
     * Classe principale che gestisce l'intero processo produttivo delle borse.
     *
     * <p>Questa classe istanzia e avvia i thread del tagliatore e del cucitore,
     * coordinando la produzione tramite il metodo {@code join()}</p>
     *
     * @author  Alessio Santoni
     * @version 1.0
     * @since   2025-11-14
     */
    public static void main(String[] args) {
        System.out.println("Avvio produzione borse\n");

        TagliatoreBorse tagliatore = new TagliatoreBorse();
        CucitoreBorse cucitore = new CucitoreBorse();

        // Avvio dei due thread in parallelo
        tagliatore.start();
        cucitore.start();

        // Aspetto che entrambi finiscano (uso di join)
        try {
            tagliatore.join();
            cucitore.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTutte le fasi completate, la produzione terminata");
    }
}
