public class EsempiMetodi {
    
    static void myMethod() {
          // code to be executed }
      
      myMethod();
    }

    // Metodo con parametri variabili (varargs)
    public int sommaMultipla(int... numeri) {
    int somma = 0;
    for (int numero : numeri) {
        somma += numero; }
    return somma;
    }
    
}
