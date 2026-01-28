public class Bil {
    // Variabler
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

    // Default konstruktor
    public Bil() {
        this.märke = "Bil_märke";
        this.modell = "Bil_modell";
        this.registreringsnummer = "ABC000";
        this.årsmodell = 1986;
        this.hastighet = 0;
    }

    // Konstruktor, felhantering
    public Bil(String märke, String modell, String registreringsnummer, int årsmodell) {
        if (märke == null || märke.trim().isEmpty()) {
            throw new IllegalArgumentException("Märket får inte vara tomt eller null");
        }
        if (modell == null || modell.trim().isEmpty()) {
            throw new IllegalArgumentException("Modellen får inte vara tom eller null");
        }
        if (registreringsnummer == null || registreringsnummer.trim().isEmpty()) {
            throw new IllegalArgumentException("Registreringsnumret får inte vara tom eller null");
        }
        if (årsmodell < 1860 || årsmodell > 2026) {
            throw new IllegalArgumentException("Årsmodellen måste vara mellan 1860-2026");
        }
        this.märke = märke;
        this.modell = modell;
        this.registreringsnummer = registreringsnummer;
        this.årsmodell = årsmodell;
        this.hastighet = 0;
    }

    // Get metod märke
    public String getMärke() {
        return märke;
    }

    // Get metod modell
    public String getModell() {
        return modell;
    }

    // Get metod registreringnummer
    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    // Get metod årsmodell
    public int getÅrsmodell() {
        return årsmodell;
    }

    // Get metod hastighet
    public int getHastighet() {
        return hastighet;
    }

    // Set metod märke
    public void setMärke(String märke) {
        if (märke == null || märke.trim().isEmpty()) {
            throw new IllegalArgumentException("Märket får inte vara null eller tom");
        }
        this.märke = märke;
    }

    // Set metod modell
    public void setModell(String modell) {
        if (modell == null || modell.trim().isEmpty()) {
            throw new IllegalArgumentException("Modellen får inte vara null eller tom");
        }
        this.modell = modell;
    }

    // Set metod modell
    public void setÅrsmodell(int årsmodell) {
        if (årsmodell < 1860 || årsmodell > 2026) {
            throw new IllegalArgumentException("Årsmodellen måste vara mellan 1860-2026");
        }
        this.årsmodell = årsmodell;
    }

    // Metod för att öka hastighet
    public void ökaHastighet(int ökning) {
        if (ökning <= 0) {
            throw new IllegalArgumentException("ökningen måste vara en siffra större än noll");
        }
        hastighet += ökning;
    }

    // Metod för bromsning
    public void bromsa(int minskning) {
        if (minskning <= 0) {
            throw new IllegalArgumentException("minskningen måste vara en siffra större än noll");
        }
        if (minskning > hastighet) {
            hastighet = 0;
        }
        hastighet -= minskning;
    }

    // toString metod
    @Override
    public String toString() {
        return "Bilen: Märke: " + märke + ", modell: " + modell + ", reg_nr: " + registreringsnummer + ", års_modell: "
                + årsmodell;
    }

}
