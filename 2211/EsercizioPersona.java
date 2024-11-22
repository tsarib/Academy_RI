public class EsercizioPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.saluta();
        persona2.saluta();

        Pirata pirata = new Pirata();
        pirata.saluta();

    }
}

    class Persona {
        public void saluta() {
            System.out.println("Ciao!");
        }
    }

    class Pirata extends Persona {
        public void saluta() {
            System.out.println("Sono un pirata!");
        }
    }
