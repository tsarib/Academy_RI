public class EsempioCondizioni {
    public static void main(String[] args){
        if (20>18){
            System.out.println("20 è maggiore di 18");
        }

        // testare variabili
        int x = 20;
        int y = 18;
        System.out.println("x è maggiore di y");

        // IF ELSE
        int time = 20;
        if(time<18){
            System.out.println("Good morning");
        } else {
            System.out.println("Good evening"); // Outputs "Good evening"
        }

        // ELIF
        int time2 = 22;
        if (time2 < 10){
            System.out.println("Buongiorno");
        } else if (time2 < 18) {
            System.out.println("Buon pomeriggio");
        } else if (time2 > 16) {
            System.out.println("Buonasera");
        } else {
            System.out.println("Buonanotte"); // Outputs "Buonanotte"
        }

        // OPERATORE TERNARIO
        int valore = 30;
        String result = (valore < 18) ? "Good day." : "Buonanotte";
        System.out.println(result);
    }
}
