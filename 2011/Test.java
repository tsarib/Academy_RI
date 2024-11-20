public class Test {
    int x; 
  
    public Test () {
      x = 5;  // Set the initial value for the class attribute x
    }
  
    public static void main(String[] args) {
      Test myObj = new Test (); //  call the constructor
      System.out.println(myObj.x); // Print the value of x
   }}