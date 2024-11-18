import java.util.Scanner;

public class Esercizio1Ciclo {
    
    // tre blocchi if, 3 input: nome utente stringa, password stringa, id int e 3 controlli a piacere
    public static void main(String[] args){
        Scanner myScannerS = new Scanner(System.in); // Create a Scanner object for string
        Scanner myScannerI = new Scanner(System.in); // Create a Scanner object for int
        
        int i = 1;
        while (i<=3){

            System.out.println("Enter username");
            String userName = myScannerS.nextLine(); // Read user input (String)
            if(userName.length()>5){
            System.out.println("Username is: " + userName); // Output username input
            }   

            System.out.println("Enter password");
            String userPassword = myScannerS.nextLine(); // Read user password (String)
            if(userPassword.length()>6){
                System.out.println("Password is: " + userPassword); // Output username password input 
            } 
            
            System.out.println("Enter id");
            int userId = myScannerI.nextInt(); // Read user id (int)
            if(userId>6){
                System.out.println("Id is: " + userId); // Output id input
            }

            i++;
            System.out.println(i);
        
        }

    }
}
