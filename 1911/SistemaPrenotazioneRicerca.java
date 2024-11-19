import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SistemaPrenotazioneRicerca {
    public static void main(String[] args){
        Scanner myScannerI = new Scanner(System.in); // Create a Scanner object for int
        Scanner myScannerS = new Scanner(System.in); // Create a Scanner object for string

        boolean[][] posti = new boolean[3][8]; // Matrice per lo stato dei posti, ogni elemento dell'array è inizialmente false
        //ArrayList prenotazione = new ArrayList();
        
        // Lista delle prenotazioni
        ArrayList<String> prenotazione = new ArrayList<>(); 

        while(true){

            System.out.println("Inserisci nome");
            String userName = myScannerS.nextLine(); // Read user input (String)
            //prenotazione.add(userName);

            System.out.println("Enter row");
            int userRow = myScannerI.nextInt(); // Read user id (int)
            //prenotazione.add(userRow);

            System.out.println("Enter column");
            int userColumn = myScannerI.nextInt(); // Read user id (int)
            //prenotazione.add(userColumn);

            System.out.println(prenotazione);

            // Controllo della validità dell'input
            if (userRow < 0 || userRow > 3 || userRow < 0 || userRow > 8) {
                System.out.println("Numero di fila o posto non valido");
                break;
            }

            if(posti[userRow-1][userColumn-1]){
                System.out.println("Il posto è già occupato");
            } else {
                // Prenota il posto
                posti[userRow-1][userColumn-1] = true;
                System.out.println("Prenotazione effettuata con successo!");
            }

            // Mostrare lo stato attuale dei posti
            System.out.println("Stato attuale dei posti occupati:");
            for (int i = 0; i < posti.length; i++) {
                for (int j = 0; j < posti[i].length; j++) {
                    if(posti[i][j]){
                        System.out.println("Fila " + (i+1) + ", Posto " + (j+1));
                    };
                }
            }

            // Uscita dal sistema
            System.out.println("Vuoi prenotare un altro posto? (y/n): ");
            String risposta = myScannerS.nextLine();
            if (risposta.equalsIgnoreCase("n")) {
                System.out.println("Grazie per aver usato il sistema di prenotazione!");
                break;
            }
        }

    }
    
}
