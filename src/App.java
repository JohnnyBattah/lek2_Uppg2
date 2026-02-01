public class App {
    public static void main(String[] args) throws Exception {
        BilRegister register = new BilRegister();

        // Lägg till bilar
        register.läggTillBil(new Bil("Volvo","XC90","ABC123",2019));
        register.läggTillBil(new Bil("Saab","9-5","XYZ789",2010));
        register.läggTillBil(new Bil("Tesla","Modell Y","DEF456",2023));

        // Visa alla bilar
        IO.println("Alla bilar i registret: ");
        IO.println(register.toString());

        // Ta bort en bil
        register.taBortBil("XYZ789");
        IO.println("\n efter att ha tagit bort en bil:");
        IO.println(register.toString());

        // Testa hitta bil
        Bil bil = register.hittaBil("DEF456");
        IO.println("\n Hittad bil: " + bil);

        // Försök lägga till bill med samma regnr, ska kasta exception
        try {
            register.läggTillBil(new Bil("BMW", "M3", "ABC123", 1989));
        } catch (IllegalArgumentException e) {
            IO.println("\n Fel: " + e.getMessage());
        }
    }
}
