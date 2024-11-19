public class EsempioStringhe {
    public static void main(String[] args){
        String saluti = "Ciao";

        String txt = "ABCDEFG";
        System.out.println("la lunghezza del testo è: " + txt.length());

        System.out.println(saluti.toUpperCase()); // Printa tutto maiuscolo
        System.out.println(saluti.toLowerCase()); // Printa tutto minuscolo
        
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Restituisce l'indice della prima occerrenza, spazi inclusi; Outputs 7
    
    }


    
}
