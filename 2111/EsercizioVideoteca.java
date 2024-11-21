import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioVideoteca {

    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        Utente tania = new Utente("123", "tania");
        Film film = new Film("Pirata dei Caraibi", 2003);
        Videoteca videoteca = new Videoteca();

        videoteca.aggiungiFilm(film);
        tania.noleggiaFilm(film);
        tania.elencoNoleggi();

        // stampaMenu();

        // int optionMenu = scannerInt.nextInt();
        // while (optionMenu<6){
        // switch (optionMenu) {

        // }
        // }

    }

    // Classe Film
    public static class Film {

        String titolo;
        int annoDiUscita;

        public Film(String titolo, int annoDiUscita) {
            this.titolo = titolo;
            this.annoDiUscita = annoDiUscita;
        }

        // Getters
        public String getTitolo() {
            return titolo;
        }

        public int getAnnoDiUscita() {
            return annoDiUscita;
        }

        // Setters
        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public void setAnnoDiUscita(int annoDiUscita) {
            this.annoDiUscita = annoDiUscita;
        }

        @Override
        public String toString() {
            return "Film{" +
                    "titolo='" + titolo + '\'' +
                    ", anno di uscita=" + annoDiUscita +
                    '}';
        }

    }

    // Classe Utente
    public static class Utente {
        String idUtente;
        String nomeUtente;
        ArrayList<Film> filmUtente;

        public Utente(String idUtente, String nomeUtente) {
            this.idUtente = idUtente;
            this.nomeUtente = nomeUtente;
            this.filmUtente = new ArrayList<Film>();

        }

        // Aggiunge film alla lista dei film
        public void noleggiaFilm(Film film) {
            filmUtente.add(film);
            System.out.println("Hai aggiunto il film: " + film.toString() + " alla tua lista di film noleggiati");
        }

        // Stampa l'elenco dei film di un utente
        public void elencoNoleggi() {
            // controlla se l'ArrayList filmUtente è vuoto
            if (filmUtente.isEmpty()) {
                System.out.println("Non hai nolleggiato nessun film!");
            } else {
                System.out.println("Libri trovati:");
                // cicla su tutti i film presenti nell'ArrayList film
                for (Film film : filmUtente) {
                    System.out.println(film.titolo + ", " + film.annoDiUscita);
                }
            }
        }

    }

    // Classe Videoteca
    public static class Videoteca {
        ArrayList<Film> videoteca;

        public Videoteca() {
            this.videoteca = new ArrayList<Film>();
        }

        public void aggiungiFilm(Film film) {
            videoteca.add(film);
            System.out.println("Hai aggiunto il film: " + film + " alla videoteca");
        }

        public void rimuoviFilm(Film film) {
            videoteca.remove(film);
            System.out.println("Hai rimosso il film: " + film + " dalla videoteca");
        }

    }

    // Classe Registro utente
    public class RegistroUtenti {

        ArrayList<Utente> utenti;

        public RegistroUtenti() {
            this.utenti = new ArrayList<Utente>();

        }

        public void addUtente(Utente ut) {

            utenti.add(ut);
        }
    }

    public static void stampaMenu() {

        System.out.println("Benvenuto! Scegli un opzione del menù:");
        System.out.println("0: Aggiungi film alla videoteca");
        System.out.println("1: Rimuovi film alla videoteca");
        System.out.println("2: Aggiungi utenti"); // devo avere un registro utenti
        System.out.println("3: Modifica noleggi utente");
        System.out.println("4: Aggiungi film da noleggiare");
        System.out.println("5: Rimuovi film da noleggiare");
        System.out.println("6: Esci");
        System.out.print("Inserisci un opzione: ");

    }

}
