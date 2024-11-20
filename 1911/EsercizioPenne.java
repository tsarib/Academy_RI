import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioPenne {

    static ArrayList<int[]> spedizioni = new ArrayList<>(); // ArrayList delle spedizioni
    static String[] colori = { "Rosso", "Blu", "Verde", "Nero" }; // lista di stringhe di colori
    static Scanner myScannerI = new Scanner(System.in); // creo uno scanner per i numeri
    static Scanner myScannerS = new Scanner(System.in); // creo uno scanner per le stringhe
    static boolean continua = true; // controllo per il ciclo while

    public static void main(String[] args) {

        while (continua) {

            System.out.println("\n--- Gestione Spedizioni Penne ---");
            System.out.println("1. Aggiungi spedizione");
            System.out.println("2. Visualizza spedizioni");
            System.out.println("3. Calcola il totale penne di ogni colore");
            System.out.println("4. Ricerca penne per colore");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = myScannerI.nextInt();
            myScannerI.nextLine(); // Consuma la nuova riga

            switch (scelta) {
                case 1:
                    aggiungiSpedizione();
                    break;
                case 2:
                    visualizzaSpedizioni();
                    break;
                case 3:
                    contaTotalePenne();
                    break;
                case 4:
                    ricercaPerColore();
                    break;

                case 5:
                    // continua = false;
                    esci();
                    break;
            }
        }
    }

    // aggiunge una spedizione specificando il numero di penne per ogni colore
    // tramite uno scanner
    public static void aggiungiSpedizione() {

        System.out.println("Inserisci il numero delle penne per ogni colore");
        // creo un'array della stessa lunghezza dell'array dei colori
        int[] nuovaSpedizione = new int[colori.length];

        // ciclo sulla lunghezza della lista colori
        for (int i = 0; i < colori.length; i++) {
            System.out.println(colori[i] + ":");
            // assegno all'indice i il numero letto in input
            nuovaSpedizione[i] = myScannerI.nextInt();
        }

        spedizioni.add(nuovaSpedizione);

    }

    // visualizza il numero delle spedizioni inserite
    public static void visualizzaSpedizioni() {
        // controlla se l'ArrayList è vuoto
        if (spedizioni.isEmpty()) {
            System.out.println("Nessuna spedizione disponibile");
        } else {
            // cicla sulla dimensione dell'ArrayList
            for (int i = 0; i < spedizioni.size(); i++) {
                System.out.println("Spedizione " + (i + 1) + ":");
                // cicla su tutti i valori delle singole spedizioni e si prende il valore di
                // ciascun colore
                for (int j = 0; j < colori.length; j++) {
                    System.out.println(colori[j] + ":" + spedizioni.get(i)[j] + " ");

                }

            }

        }

    }

    // conta il totale delle penne per ogni colore
    public static void contaTotalePenne() {
        // controlla se l'ArrayList è vuoto
        if (spedizioni.isEmpty()) {
            System.out.println("Nessuna spedizione disponibile");
        } else {
            // array della stessa lunghezza dei colori per la somma del totale
            int[] totalePennePerColore = new int[colori.length];
            for (int i = 0; i < spedizioni.size(); i++) { // cicla sulla dimensione dell'ArrayList
                // cicla su tutti i valori delle singole spedizioni
                for (int j = 0; j < colori.length; j++) {
                    // aggiungo all'indice j del totale il valore corrispondente di ciascuna
                    // spedizione
                    totalePennePerColore[j] += spedizioni.get(i)[j];
                }
            }
            // per ogni colori stampa il totale
            for (int i = 0; i < colori.length; i++) {
                System.out.println(colori[i] + ":" + totalePennePerColore[i]);
            }

        }
    }

    // ricerca almeno una spedizione che abbia una penna del colore specificato
    public static void ricercaPerColore() {
        System.out.println("Scegli il colore da cercare");
        String coloreDaCercare = myScannerS.nextLine();
        boolean trovato = false; // controllo per vedere se il colore è stato trovato
        int indiceColore = -1; // inizializzazione dell'indice colore
        // ciclo sulla lunghezza dei colori
        for (int i = 0; i < colori.length; i++) {
            // se trovo un colore uguale al colore che sto cercando
            if (colori[i].toLowerCase().equals(coloreDaCercare.toLowerCase())) {
                trovato = true;
                indiceColore = i; // indice colore corrispondente al colore cercato
            }
        }

        // se non ho trovato nessun colore con quel nome
        if (!trovato) {
            System.out.println("Il colore non esiste");
            return;
        }

        boolean spedizioneTrovata = false; // controllo per vedere se almeno una spedizione è stata trovata
        // cicla sulla dimensione dell'ArrayList
        for (int i = 0; i < spedizioni.size(); i++) { 
            // se il numero di penne corrispondente al colore cercato è maggiore di 0
            if (spedizioni.get(i)[indiceColore] > 0) {
                spedizioneTrovata = true;
                System.out.println("La spedizione numero " + (i + 1) + " ha almeno una penna di colore "
                        + coloreDaCercare);
            }
        }

        // se il colore non è stato trovato in nessuna spedizione
        if (!spedizioneTrovata) {
            System.out.println("Il colore non è stato trovato in nessuna spedizione");
            return;
        }
    }

    // Uscita dal sistema
    public static void esci() {
        System.out.println("Sei sicuro di voler uscire? (y/n): ");
        String risposta = myScannerS.nextLine();
        if (risposta.equalsIgnoreCase("y")) {
            System.out.println("Grazie per aver usato il sistema di prenotazione!");
            continua = false;
        }
    }

}