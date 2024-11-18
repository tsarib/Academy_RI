public class Variabili {
    public static void main(String[] args){
        int provaNumero = 7;
        System.out.println(provaNumero);

        String provaTesto = "Ciao Mondo";
        System.out.println(provaTesto);

        boolean provaBool = false;
        System.out.println(provaBool);

        // concanetazione 
        String testo = "Hello ";
        System.out.println(testo + "world!");

        // inizializzazione a cascata divisa
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        // inizializzazione a cascata
        int w = 5;
        int q = 6;
        System.out.println(w + q);

        // tipi primitivi
        byte myByte = 100; // Byte
        System.out.println("Tipo Byte: " + myByte);

        short myShort = 5000; //Short
        System.out.println("Tipo Short: " + myShort);

        int myInt = 100000; //Int

        long myLong = 1500000000L; //Long, bisogna specificare una L alla fine

        float myFloat = 5.75f; // Float, bisogna specificare una f alla fine
        System.out.println("Tipo float: " + myFloat);

        double myDouble = 19.99d; // Double, bisogna specificare una d alla fine
        System.out.println("Tipo double: " + myDouble);
    }
}
