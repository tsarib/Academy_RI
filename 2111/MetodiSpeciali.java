
public class MetodiSpeciali {

    String colore;
    int quantita;
    Penna penna = new Penna;
    
    // Metodo toString()
    @Override
    public String toString() {
        return "Penne{" +
                "colore='" + colore + '\'' +
                ", quantita=" + quantita +
                '}';
    }

    // Il metodo equals(Object obj) viene utilizzato per confrontare se due
    // oggetti sono logicamente uguali

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Penna penna = (Penna) obj;
        return quantita == penna.quantita && colore.equals(penna.colore);
    }

    // Metodo hashCode()
    @Override
    public int hashCode() {
        return colore.hashCode() + quantita * 31; // Calcola un valore hash
    }
}
