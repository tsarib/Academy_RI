public class Iterazioni {
    public static void main(String[] args){

        // while matematico
        int i = 1; // inizializzazione della variabile di controllo
        System.out.println("Ciclo while matematico");
        while(i<=5){
            i++;
            System.out.println(i);
        }

        // while booleano
        boolean continua = true; // inizializzazione della variabile booleana
        int contatore = 1; // inizializzazione della variabile di controllo
        System.out.println("Ciclo while booleano");
        while(continua){
            contatore++;
            System.out.println(contatore);
            if(contatore>5){
                continua=false;
            }
        }

        // for
        System.out.println("Ciclo for");
        for (int x=1; x<=5; x++){ // ripete finché x è <=5
            System.out.println(x);
        }
    }
}
