package b09a1;
import b06a2.Rational;

public class FeldRationalTest {
    public static boolean istHomogenCheck(Rational[] f, boolean erw) {
        boolean erg = FeldRational.istHomogen(f);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: istHomogen(...) == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean istHomogenTest() {
        return (istHomogenCheck(new Rational[]{}, true));
    }

    public static boolean test(){
        return (istHomogenTest());
    }

    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
