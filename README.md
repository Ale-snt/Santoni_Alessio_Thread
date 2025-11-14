# Produzione Borse

## Descrizione del Progetto
**Autore:** Alessio Santoni  
**Data:** 14/11/2025  

Questo progetto simula un piccolo processo produttivo utilizzando il multithreading in Java. La produzione delle borse è divisa in due fasi principali:  

- **Taglio del tessuto**  
- **Cucitura delle borse**

Ogni fase è gestita da un thread dedicato, che lavora in parallelo per rappresentare una catena di produzione semplice ma realistica.  

Il programma avvia entrambi i thread, attende il loro completamento tramite `join()` e comunica quando tutte le operazioni sono terminate.

Questo esempio è utile per comprendere il funzionamento base dei thread in Java, la simulazione dei tempi di lavoro tramite `sleep()` e il coordinamento tra processi concorrenti.
