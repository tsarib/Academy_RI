package EsercizioEreditarietà;

import java.util.Scanner;

public class EsercizioEreditarietà {

    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Benvenuto, inserisci nome utente e password");

        System.out.println("Nome utente:");
        String nome = scannerString.nextLine();
        System.out.println("Email:");
        String mail = scannerString.nextLine();
        Utente utente = new Utente(nome, mail);

        stampaMenu();

        int optionMenu = scannerInt.nextInt();
        while (optionMenu < 2) {
            switch (optionMenu) {
                case 0:
                    System.out.println(utente.getNomeUtente());
                    System.out.println(utente.getEmailUtente());
                    break;

            }

        }
        
        stampaMenu();
        optionMenu = scannerInt.nextInt();

    }

    public static void stampaMenu() {

        System.out.println("Benvenuto! Scegli un opzione del menù:");
        System.out.println("0: Stampa dati utente");
        System.out.println("1: Interagisci col profilo");
        System.out.println("2: Esci");
        System.out.print("Inserisci un opzione: ");

    }

}