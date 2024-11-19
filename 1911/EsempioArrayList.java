import java.util.ArrayList;
import java.util.Arrays;

public class EsempioArrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.set(0, "Opel"); // aggiunge un elemento all'indice 0
        System.out.println(cars);
        System.out.println(cars.get(0));

        // rimuove l'elemento all'indice 0
        // cars.remove(0);

        // pulisce tutti gli elementi dell'ArrayList
        // cars.clear();

        // convertire un array in un ArrayList
        Integer arr[] = {1,2,3,4,5,6};
        System.out.println("Array: " + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array dopo l'aggiunta: " + Arrays.toString(arr));
    }
    
}
