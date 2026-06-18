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

    public static boolean parseCheck(String s, Rational erw) {
        Rational erg = Rational.parse(s);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: parse(\"" + s + "\")==" + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean parseTest() {
        return (
                parseCheck("-2/3", new Rational(-2, 3)) &
                parseCheck("24/-8", new Rational(-3, 1)) &
                parseCheck("-20/-20", new Rational(1, 1)) &
                parseCheck("+4/+2", new Rational(2, 1))
        );
    }

    public static boolean parseIllegalCheck(String s) {
        try {
            Rational.parse(s);
            System.out.println("FEHLER: parse(\"" + s + "\") wirft keine IllegalArgumentException");
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public static boolean parseIllegalTest() {
        return (
                parseIllegalCheck("2") &
                parseIllegalCheck("2/3/4") &
                parseIllegalCheck("/3") &
                parseIllegalCheck("2/") &
                parseIllegalCheck("a/3") &
                parseIllegalCheck("2/a") &
                parseIllegalCheck("2 / 3")
        );
    }

    public static boolean parseArithmeticCheck(String s) {
        try {
            Rational.parse(s);
            System.out.println("FEHLER: parse(\"" + s + "\") wirft keine ArithmeticException");
            return false;
        } catch (ArithmeticException e) {
            return true;
        }
    }

    public static boolean parseArithmeticTest() {
        return (
                parseArithmeticCheck("2/0") &
                parseArithmeticCheck("-5/0")
        );
    }

    public static boolean test() {
        return (
                istKleinerTest() &
                absTest() &
                rezTest() &
                equalsTest() &
                parseTest() &
                parseIllegalTest() &
                parseArithmeticTest()
        );
    }

    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
