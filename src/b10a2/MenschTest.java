package b10a2;

public class MenschTest {

    public static boolean alterCheck(Mensch m, int erw) {
        int erg = m.alter();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: alter() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean alterTest() {
        return (
                alterCheck(new Mann("Max", 20, 180, 80), 20) &&
                alterCheck(new Frau("Anna", 17, 170, 60), 17)
        );
    }

    public static boolean gewichtCheck(Mensch m, int erw) {
        int erg = m.gewicht();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: gewicht() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean gewichtTest() {
        return (
                gewichtCheck(new Mann("Max", 20, 180, 80), 85) &&
                gewichtCheck(new Frau("Anna", 17, 170, 60), 60)
        );
    }

    public static boolean groesseCheck(Mensch m, int erw) {
        int erg = m.groesse();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: groesse() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean groesseTest() {
        return (
                groesseCheck(new Mann("Max", 20, 180, 80), 180) &&
                groesseCheck(new Frau("Anna", 17, 170, 60), 165)
        );
    }

    public static boolean chromosomenCheck(Mensch m, String erw) {
        String erg = m.chromosomen();
        boolean istKorrekt = erg.equals(erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: chromosomen() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean chromosomenTest() {
        return (
                chromosomenCheck(new Mann("Max", 20, 180, 80), "XY") &&
                chromosomenCheck(new Frau("Anna", 17, 170, 60), "XX")
        );
    }

    public static boolean volljaehrigCheck(Mensch m, boolean erw) {
        boolean erg = m.istVolljaehrig();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: istVolljaehrig() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean volljaehrigTest() {
        return (
                volljaehrigCheck(new Mann("Max", 18, 180, 80), true) &&
                volljaehrigCheck(new Frau("Anna", 17, 170, 60), false)
        );
    }

    public static boolean preisHaarschnittCheck(Mensch m, int erw) {
        int erg = m.preisHaarschnitt();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: preisHaarschnitt() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean preisHaarschnittTest() {
        return (
                preisHaarschnittCheck(new Mann("Max", 20, 180, 80), 15) &&
                preisHaarschnittCheck(new Frau("Anna", 17, 170, 60), 46)
        );
    }

    public static boolean test() {
        return (
                alterTest() &&
                gewichtTest() &&
                groesseTest() &&
                chromosomenTest() &&
                volljaehrigTest() &&
                preisHaarschnittTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
