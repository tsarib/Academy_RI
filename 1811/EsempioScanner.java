import java.util.Scanner;
public class EsempioScanner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object for string
        System.out.println("Enter username");

        /*Scanner myObjInt = new Scanner(System.in); // Create a Scanner object for int
        int intero = myObjInt.nextInt();
        System.out.println("Numero is: " + intero);*/

        String userName = myObj.nextLine(); // Read user input      
        System.out.println("Username is: " + userName); // Output user input
        
        //myObj.close();

    }
    
}
