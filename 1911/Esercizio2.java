public class Esercizio2 {
    public static void main(String[] args){

        for (int x=1; x<=7; x++){ // ripete finché x è <=7
            System.out.println(x);
            switch(x){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2: 
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thurday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Monday");
                    break;
            }
        }
    }
    
}
