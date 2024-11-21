package EsercizioEreditarietà;
import java.util.Random;

public class Utente extends Ristorante {
    private String nomeUtente;
    private String emailUtente;
    private float soldiUtente;
    private Random random = new Random();

    public Utente(String nomeUtente, String emailUtente){
        this.nomeUtente = nomeUtente;
        this.emailUtente = emailUtente;
        this.soldiUtente = random.nextFloat();
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getEmailUtente() {
        return emailUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public void setEmailUtente(String emailUtente) {
        this.emailUtente = emailUtente;
    }

}

