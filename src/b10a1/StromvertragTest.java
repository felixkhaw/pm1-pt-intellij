package b10a1;

public class StromvertragTest {

    public static boolean nummerCheck(Stromvertrag s, int erw) {
        int erg = s.nummer();
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: nummer() == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean monatCheck(Stromvertrag s, int erw) {
        int erg = s.monat();
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: monat() == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean zaehlerCheck(Stromvertrag s, int erw) {
        int erg = s.zaehler();
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: zaehler() == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean kostenFixCheck(Stromvertrag s, int monate, int erw) {
        int erg = s.kostenFix(monate);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: kostenFix(" + monate + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean kostenVariabelCheck(Stromvertrag s, int monate, int kwh, int erw) {
        int erg = s.kostenVariabel(monate, kwh);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: kostenVariabel(" + monate + "," + kwh + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean stromvertragTest() {
        Stromvertrag s = new Stromvertrag(10, "Felix", 100);

        return (
                monatCheck(s, 10) &&
                zaehlerCheck(s, 100) &&
                kostenFixCheck(s, 3, 3000) &&
                kostenVariabelCheck(s, 3, 50, 1500)
        );
    }

    public static boolean test() {
        return stromvertragTest();
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}