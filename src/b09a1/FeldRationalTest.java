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
        return (
                istHomogenCheck(new Rational[]{}, true) &&
                istHomogenCheck(
                        new Rational[]{
                            new Rational(3,4),
                            new Rational(3,4),
                            new Rational(3,4),
                            new Rational(3,4),
                        }, true ) &&
                istHomogenCheck(
                        new Rational[]{
                            new Rational(3,4),
                            new Rational(3,4),
                            new Rational(3,4),
                            new Rational(3,5),
                        }, false)
        );
    }

    public static boolean istSortiertCheck(Rational[] f, boolean erw) {
        boolean erg = FeldRational.istSortiert(f);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: istSortiert(...) == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean istSortiertTest() {
        return (
                istSortiertCheck(
                        new Rational[]{
                                new Rational(-2,5),
                                new Rational(3,8),
                                new Rational(3,5),
                                new Rational(5,7),
                        }, true 
                ) &&
                istSortiertCheck(
                        new Rational[]{
                                new Rational(1,4),
                                new Rational(1,8)
                        }, false
                )
        );
    }

    public static boolean maxPosCheck(Rational[] f, int erw) {
        int erg = FeldRational.maxPos(f);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: maxPos(...) == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean maxPosTest() {
        return (
                maxPosCheck(
                        new Rational[]{
                                new Rational(-2,5),
                                new Rational(3,8),
                                new Rational(3,5),
                                new Rational(5,7),
                        }, 3
                )
        );
    }

    public static boolean maxElementCheck(Rational[] f, Rational erw) {
        Rational erg = FeldRational.maxElement(f);
        boolean istKorrekt = (erg.equals(erw));
        if (!istKorrekt) {
            System.out.println("FEHLER: maxElement(...) == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean maxElementTest() {
        return (
                maxElementCheck(
                        new Rational[]{
                                new Rational(-2,5),
                                new Rational(3,8),
                                new Rational(3,5),
                                new Rational(5,7),
                        }, new Rational(5,7)
                )
        );
    }
    

    public static boolean test(){
        return (
                istHomogenTest() &&
                istSortiertTest() &&
                maxPosTest() &&
                maxElementTest()
        );
    }

    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
