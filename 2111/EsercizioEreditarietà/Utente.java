package EsercizioEreditarietà;
import java.util.Random;

public class Utente extends Ristorante {
    protected String nomeUtente;
    protected String emailUtente;
    protected float soldiUtente;
    protected Random random = new Random();

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

    @Override
    public String toString() {
        return "Utente{" +
                    "nome utente='" + nomeUtente + '\'' +
                    ", email=" + emailUtente +
                    '}';
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     Utente utente = (Utente) utente;
    //     return nomeUtente == utente.nomeUtente && utente.equals(utente.nomeUtente);
    // }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public void setEmailUtente(String emailUtente) {
        this.emailUtente = emailUtente;
    }

    

}

