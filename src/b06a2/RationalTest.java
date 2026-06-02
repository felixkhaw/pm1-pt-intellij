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
        return istKleinerCheck(new Rational(1,2),new Rational(3,4), true);
    }

    public static boolean test() {
        return istKleinerTest();
    }

    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
