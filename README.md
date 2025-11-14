# Produzione Borse - Documentazione

## Titolo
Produzione Borse con Thread in Java

## Data
13 Novembre 2025

## Autore
Santoni Alessio

## Descrizione
Questo progetto simula la produzione di borse utilizzando due thread Java:
- `TagliatoreBorse`: si occupa di tagliare il tessuto.
- `CucitoreBorse`: si occupa di cucire le borse.
Entrambi i thread vengono eseguiti in parallelo e il programma principale attende il loro completamento prima di terminare.

## Versione
1.0.0

## Tecnologie Utilizzate
- Java SE 8 o superiore
- Threading in Java

## Funzionalità Principali
1. Simulazione del taglio del tessuto delle borse con ritardo di 1 secondo.
2. Simulazione della cucitura delle borse con ritardo di 1,5 secondi.
3. Esecuzione parallela dei thread per ottimizzare i tempi.
4. Gestione delle eccezioni `InterruptedException`.

## Istruzioni per l’Esecuzione
1. Compilare tutte le classi Java:  
   ```bash
   javac TagliatoreBorse.java CucitoreBorse.java ProduzioneBorse.java

