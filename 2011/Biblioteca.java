import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> libri;

    public Biblioteca() {
        libri = new ArrayList<Libro>();

    }

    // Metodo per aggiungere un libro alla libreria
    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    // Metodo per stampare i libri presenti nella libreria
    public void stampaLibri() {
        if (libri.isEmpty()) {
            System.out.println("Nessun libro è presente nella biblioteca!");
        } else {
            System.out.println("Libri trovati:");
            // cicla su tutti i libri presenti nell'ArrayList libri
            for (Libro libro : libri) {
                System.out.println(libro.nomeAutore + ", " + libro.numeroPagine);
            }
        }
    }

    // Metodo per cercare il libro per autore
    public void cercaPerAutore(String autore) {
        boolean trovato = false;
        for (Libro libro : libri) {
            // controlla se il libro ha come autore l'autore scelto
            if (libro.nomeAutore.equalsIgnoreCase(autore)) {
                System.out.println("Libri trovati per l'autore: " + autore);
                System.out.println(libro.nomeAutore + ", " + libro.numeroPagine);
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro è stato trovato per: " + autore);
        }

    }

    // Metodo per cercare il libro basandosi sul numero delle pagine massimo
    public void cercaPerMaxPagine(int pagine) {
        boolean trovato = false;
        for (Libro libro : libri) {
            // controlla se il libro ha almeno il numero delle pagine indicate
            if (libro.numeroPagine <= pagine) {
                System.out.println("Libri trovati di massimo " + pagine + " pagine:");
                System.out.println(libro.nomeAutore + ", " + libro.numeroPagine);
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro con massimo " + pagine + " pagine è stato trovato");
        }
    }

    public static void main(String[] args) {
        // Crezione di un oggetto libro
        Libro libro1 = new Libro("Jane Austen", 200);
        Libro libro2 = new Libro("Alessandro Manzoni", 700);

        // Creazione dell'oggetto biblioteca
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);
        biblioteca.stampaLibri();
        biblioteca.cercaPerAutore("Jane Austen");
        biblioteca.cercaPerMaxPagine(300);

        //
    }
}
