package b10a4;

import b06a3.Punkt2D;
import b10a3.Figur;

public class KreisPerMitteRadiusTest {

    public static boolean doubleCheck(String name, double erg, double erw) {
        boolean istKorrekt = Math.abs(erg - erw) < 0.0000001;

        if (!istKorrekt) {
            System.out.println("FEHLER: " + name + " == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean punktCheck(String name, Punkt2D erg, double x, double y) {
        boolean istKorrekt = (erg.x() == x && erg.y() == y);

        if (!istKorrekt) {
            System.out.println("FEHLER: " + name + " == " + erg + " statt " + x + "/" + y);
        }

        return istKorrekt;
    }

    public static boolean booleanCheck(String name, boolean erg, boolean erw) {
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: " + name + " == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean stringCheck(String name, String erg, String erw) {
        boolean istKorrekt = erg.equals(erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: " + name + " == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean radiusTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return doubleCheck("radius()", k.radius(), 5);
    }

    public static boolean mitteTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return punktCheck("mitte()", k.mitte(), 2, 3);
    }

    public static boolean durchmesserTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return doubleCheck("durchmesser()", k.durchmesser(), 10);
    }

    public static boolean umfangTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return doubleCheck("umfang()", k.umfang(), 10 * Math.PI);
    }

    public static boolean flaecheTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return doubleCheck("flaeche()", k.flaeche(), 25 * Math.PI);
    }

    public static boolean istEnthaltenTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        return (
                booleanCheck("istEnthalten mitte", k.istEnthalten(new Punkt2D(2, 3)), true)
                && booleanCheck("istEnthalten rand", k.istEnthalten(new Punkt2D(5, 7)), true)
                && booleanCheck("istEnthalten innen", k.istEnthalten(new Punkt2D(3, 4)), true)
                && booleanCheck("istEnthalten aussen", k.istEnthalten(new Punkt2D(8, 7)), false)
        );
    }

    public static boolean verschiebeTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);

        Figur f = k.verschiebe(4, -1);

        return (
                booleanCheck("verschiebe Rueckgabe", f == k, true)
                && punktCheck("mitte nach verschiebe", k.mitte(), 6, 2)
        );
    }

    public static boolean kopierKonstruktorTest() {
        KreisPerMitteRadius k1 = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);
        KreisPerMitteRadius k2 = new KreisPerMitteRadius(k1);

        k1.verschiebe(10, 10);

        return (
                punktCheck("kopie mitte", k2.mitte(), 2, 3)
                && doubleCheck("kopie radius", k2.radius(), 5)
        );
    }

    public static boolean toStringTest() {
        KreisPerMitteRadius k = new KreisPerMitteRadius(new Punkt2D(2, 3), 5);

        return stringCheck("toString()", k.toString(), "[ 2.0/3.0, 5 ]");
    }

    public static boolean test() {
        return (
                radiusTest()
                && mitteTest()
                && durchmesserTest()
                && umfangTest()
                && flaecheTest()
                && istEnthaltenTest()
                && verschiebeTest()
                && kopierKonstruktorTest()
                && toStringTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
