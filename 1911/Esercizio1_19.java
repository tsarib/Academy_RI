import java.util.Scanner;

public class Esercizio1_19 {
    public static void main(String[] args){
        Scanner myScannerI = new Scanner(System.in); // Create a Scanner object for int
        int number;

        do{
            System.out.println("Enter number");
            number = myScannerI.nextInt(); // Read user number input (int)
            System.out.println("Number is: " + number); // Output user input
            if((number%2)==0){ // Check if the number is even
                System.out.println("Your number is even");
            } else { // else the number is odd
                System.out.println("Your number is odd");
            }
        }while(number > 0);
    }
    
}
