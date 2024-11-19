import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioPenne {

    static ArrayList<int[]> spedizioni = new ArrayList<>(); // ArrayList delle spedizioni
    static String[] colori = {"Rosso", "Blu", "Verde", "Nero"}; // lista di colori
    public static void main(String[] args){
        aggiungiSpedizione();
        visualizzaSpedizioni();
    }

    public static void aggiungiSpedizione(){

        System.out.println("Inserisci il numero delle penne per ogni colore");
        Scanner myScannerI = new Scanner(System.in); // creo uno scanner per i numeri
        int[] nuovaSpedizione = new int[colori.length]; // creo un'array della stessa lunghezza dell'array dei colori

        for(int i=0; i<colori.length; i++){
            System.out.println(colori[i] + ":");
            nuovaSpedizione[i] = myScannerI.nextInt(); // legge il numero in input
        }

        spedizioni.add(nuovaSpedizione);

    }

    public static void visualizzaSpedizioni(){
        if(spedizioni.isEmpty()){
            System.out.println("Nessuna spedizione disponibile");
        } else { 
            for(int i=0;i<spedizioni.size(); i++){
                System.out.println("Spedizione " + (i+1) + ":");
                for(int j=0; j<colori.length; j++){
                    System.out.println(colori[j] + ":" + spedizioni.get(i)[j] + " ");

                }
                
            }

        }

    }
    
}
