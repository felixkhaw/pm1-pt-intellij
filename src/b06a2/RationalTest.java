package b06a2;

public class RationalTest {
    public static boolean istKleinerCheck(Rational a, Rational b, boolean erw) {
        boolean erg = a.istKleiner(b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: istKleiner(" + a.toString() + "," + b.toString() + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean istKleinerTest() {
        return (
                istKleinerCheck(new Rational(1,2),new Rational(3,4), true) &
                istKleinerCheck(new Rational(-1,3), new Rational(-2,3),false)
        );
    }

    public static boolean absCheck(Rational a, boolean erw) {
        boolean erg = (a.abs().zaehler() == a.zaehler()*(-1)); // Nenner wird im Konstruktor normalisiert
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: abs(" + a.toString() + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean absTest() {
        return (
                absCheck(new Rational(-1,2), true)
        );
    }

    public static boolean rezCheck(Rational a, boolean erw) {
        boolean erg = (a.zaehler() == a.rez().nenner() && a.nenner() == a.rez().zaehler());
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: abs(" + a.rez().toString() + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean rezTest() {
        return (
                rezCheck(new Rational(1,2), true)
        );
    }

    public static boolean equalsCheck(Rational a, Rational b, boolean erw) {
        boolean erg = (a.equals(b));
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: abs(" + a.toString() + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean equalsTest() {
        return (
                equalsCheck(new Rational(1,2),new Rational(1,2), true) &
                equalsCheck(new Rational(1,2),new Rational(2,1), false)
        );
    }

    public static boolean test() {
        return (
                istKleinerTest() &
                absTest() &
                rezTest() &
                equalsTest()
        );
    }

    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
