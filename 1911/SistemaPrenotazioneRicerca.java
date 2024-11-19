import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SistemaPrenotazioneRicerca {
    public static void main(String[] args){
        Scanner myScannerI = new Scanner(System.in); // Create a Scanner object for int
        Scanner myScannerS = new Scanner(System.in); // Create a Scanner object for string

        boolean[][] posti = new boolean[3][8];
        ArrayList prenotazione = new ArrayList();

        System.out.println("Enter name");
        String userName = myScannerS.nextLine(); // Read user input (String)
        prenotazione.add(userName);

        System.out.println("Enter row");
        int userRow = myScannerI.nextInt(); // Read user id (int)
        prenotazione.add(userRow);

        System.out.println("Enter column");
        int userColumn = myScannerI.nextInt(); // Read user id (int)
        prenotazione.add(userColumn);

        System.out.println(prenotazione);

        // Controllo della validità dell'input
        if (userRow < 0 || userRow >= 3 || userRow < 0 || userRow >= 8) {
            System.out.println("Numero di fila o posto non valido. Riprova.");
        }

        if(posti[userRow][userColumn]){
            System.out.println("Il posto è già occupato");
        }else {
            // Prenota il posto
            posti[userRow][userColumn] = true;
            System.out.println("Prenotazione effettuata con successo!");
        }

    }
    
}
