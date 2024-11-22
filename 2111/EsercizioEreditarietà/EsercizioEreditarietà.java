package EsercizioEreditarietà;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioEreditarietà {

    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        boolean continua = true; // controllo per il ciclo while

        ArrayList<Utente> registroUtenti = new ArrayList<>();

        while (continua) {
            stampaMenu();
            int scelta = scannerInt.nextInt();
            scannerInt.nextLine(); // consuma la nuova riga

            switch (scelta) {
                case 0: // crea utente
                    System.out.println("Benvenuto, inserisci nome utente e password");

                    System.out.println("Nome utente:");
                    String nome = scannerString.nextLine();
                    System.out.println("Email:");
                    String mail = scannerString.nextLine();
                    Utente utente = new Utente(nome, mail);
                    registroUtenti.add(utente);

                    System.out.println("Utente creato con successo");

                    break;
                case 1: // visualizza utenti
                    if (registroUtenti.isEmpty()) {
                        System.out.println("Non è presente nessun utente!");
                    }
                    System.out.println("Gli utenti presenti sono:");
                    for (Utente ut : registroUtenti) {
                        System.out.println("Utente numero " + registroUtenti.indexOf(ut));
                        System.out.println("Nome utente: " + ut.getNomeUtente());
                        System.out.println("email utente: " + ut.getEmailUtente());
                    }

                    break;
                case 2: // esci
                    System.out.println("Sei sicuro di voler uscire? (y/n): ");
                    String risposta = scannerString.nextLine();
                    if (risposta.equalsIgnoreCase("y")) {
                        System.out.println("Grazie per aver usato il nostro sistema!");
                        continua = false;
                    }
                    break;

                default:
                    System.out.println("Scelta non valida, inserisci un nuovo numero: ");
                    break;
            }
        }

    }

    public static void stampaMenu() {

        System.out.println("Benvenuto! Scegli un opzione del menù:");
        System.out.println("0: Crea utente");
        System.out.println("1: Stampa dati utente");
        System.out.println("2: Interagisci col profilo");
        System.out.println("3: Esci");
        System.out.print("Inserisci un opzione: ");

    }

}