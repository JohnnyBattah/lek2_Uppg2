import java.util.ArrayList;

public class BilRegister {
    // Privat lista
    private ArrayList<Bil> bilar;
    
    public BilRegister() {
        this.bilar = new ArrayList<Bil>();
    }

    public Bil hittaBil(String registreringsnummer){
        for (Bil bil: bilar){
            if (bil.getRegistreringsnummer().equals(registreringsnummer)) {
                return bil;
            }
        }
        return null;
    }

    // Lägg till bil
    public void läggTillBil(Bil bil){
        if (hittaBil(bil.getRegistreringsnummer()) != null) {
            throw new IllegalArgumentException("En bil detta registrerings nummer finns redan");
        }
        bilar.add(bil);
    }

    // Ta bort bil
    public void taBortBil(String registreingsnummer){
        Bil bil = hittaBil(registreingsnummer);
        if (bil == null) {
            throw new IllegalArgumentException("Ingen bil med registreringsnumret finns");
        }
        bilar.remove(bil);
    }

    // String metod
    public String toString(){
        String resultat = "";

        for(Bil bil: bilar){
            resultat+=bil + "\n";
        }
        return resultat;
    }
}
