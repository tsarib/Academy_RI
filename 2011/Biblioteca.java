import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> libri;

    public Biblioteca() {
        libri = new ArrayList<Libro>();

    }

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public void stampaLibri() {
        if (libri.isEmpty()) {
            System.out.println("Nessun libro è presente nella biblioteca!");
        } else {
            for (int i = 0; i < libri.size(); i++) {
                System.out.println(libri.get(i).nomeAutore + ", " + libri.get(i).numeroPagine);
            }
        }
    }

    public void cercaPerAutore(String autore){
        boolean trovato = false;
        for(Libro libro : libri){
            if(libro.nomeAutore.equalsIgnoreCase(autore)){
                System.out.println(libro.nomeAutore + ", " + libro.numeroPagine);
                trovato = true;
            }
        }
        if(!trovato){
            System.out.println("Nessun libro è stato trovato per questo autore");
        }


    }

    public static void main(String[] args) {
        // Crezione di un oggetto libro
        Libro libro1 = new Libro("Jane Austen", 200);

        // Creazione dell'oggetto biblioteca
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(libro1);
        biblioteca.stampaLibri();
        biblioteca.cercaPerAutore("Jane Austen");

        //
    }

}
