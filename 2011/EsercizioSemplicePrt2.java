public class EsercizioSemplicePrt2 {
    public static void main(String[] args) {
        Calciatore calciatore1 = new Calciatore("Mario", "Attaccante");
        System.out.println("Calciatore 1: " + calciatore1.getNomeCalciatore());
    }
}

class Calciatore {
    private String nome;
    private String ruolo;

    public Calciatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public String getNomeCalciatore() {
        return nome;
    }

    public String getRuoloCalciatore() {
        return ruolo;
    }
}

class Squadra {
    private String nomeSquadra;
    private Calciatore calciator1;
    private Calciatore calciator2;
    private Calciatore calciator3;

    public Squadra(String nomeSquadra, Calciatore calciatore1, Calciatore calciatore2, Calciatore calciatore3) {
        this.nomeSquadra = nomeSquadra;
        if (!calciatore1.getNomeCalciatore().equals(calciatore2) && !calciatore2.getNomeCalciatore().equals(calciatore3)
                && !calciatore1.getNomeCalciatore().equals(calciatore3)) {
            
        }
    }
}