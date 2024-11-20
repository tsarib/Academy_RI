public class Prenotazione {
    String nomeCliente;
    int riga;
    int colonna;

    // Costruttore parametrizzato
    public Prenotazione(String nomeCliente, int riga, int colonna) {
        this.nomeCliente = nomeCliente;
        this.riga = riga;
        this.colonna = colonna;
    }
}