import java.util.Arrays;

public class EsempiArray {
    public static void main(String[] args){
        int[] numeri = {10, 20, 30, 40, 50}; // inizializzazione dell'array
        System.out.println(numeri[1]);

        // for che cicla sull'array
        for(int i=0; i<numeri.length; i++){
            System.out.println("Numeri: " + numeri[i]);
        }

        // array to string
        System.out.println("Array: " + Arrays.toString(numeri)); // stampa array come stringa

        // for each
        for (int numero : numeri){
            System.out.println("Numero: " + numero);
        }
    }
    
}
