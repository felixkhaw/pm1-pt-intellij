package b10a3;

import b06a3.Punkt2D;

public class FigurTest {

    public static boolean doubleCheck(String name, double erg, double erw) {
        boolean istKorrekt = (erg == erw);

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

    public static boolean mitteTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return punktCheck("mitte()", r.mitte(), 10, 5);
    }

    public static boolean breiteTiefeTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return (
                doubleCheck("breite()", r.breite(), 4)
                && doubleCheck("tiefe()", r.tiefe(), 2)
        );
    }

    public static boolean flaecheTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return doubleCheck("flaeche()", r.flaeche(), 8);
    }

    public static boolean umfangTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return doubleCheck("umfang()", r.umfang(), 12);
    }

    public static boolean durchmesserTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(0, 0), 3, 4);

        return doubleCheck("durchmesser()", r.durchmesser(), 5);
    }

    public static boolean eckeTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return (
                punktCheck("ecke(false,false)", r.ecke(false, false), 8, 4)
                && punktCheck("ecke(false,true)", r.ecke(false, true), 8, 6)
                && punktCheck("ecke(true,false)", r.ecke(true, false), 12, 4)
                && punktCheck("ecke(true,true)", r.ecke(true, true), 12, 6)
        );
    }

    public static boolean istEnthaltenTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return (
                booleanCheck("istEnthalten innen", r.istEnthalten(new Punkt2D(10, 5)), true)
                && booleanCheck("istEnthalten rand", r.istEnthalten(new Punkt2D(8, 4)), true)
                && booleanCheck("istEnthalten ausserhalb x", r.istEnthalten(new Punkt2D(7, 5)), false)
                && booleanCheck("istEnthalten ausserhalb y", r.istEnthalten(new Punkt2D(10, 7)), false)
        );
    }

    public static boolean verschiebeTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        Figur f = r.verschiebe(3, -2);

        return (
                booleanCheck("verschiebe Rueckgabe", f == r, true)
                && punktCheck("mitte nach verschiebe", r.mitte(), 13, 3)
                && punktCheck("ecke nach verschiebe", r.ecke(false, false), 11, 2)
        );
    }

    public static boolean kopierKonstruktorTest() {
        RechteckXYPerMitteLaengen r1 = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);
        RechteckXYPerMitteLaengen r2 = new RechteckXYPerMitteLaengen(r1);

        r1.verschiebe(10, 0);

        return (
                punktCheck("kopie mitte", r2.mitte(), 10, 5)
                && doubleCheck("kopie breite", r2.breite(), 4)
                && doubleCheck("kopie tiefe", r2.tiefe(), 2)
        );
    }

    public static boolean toStringTest() {
        RechteckXYPerMitteLaengen r = new RechteckXYPerMitteLaengen(new Punkt2D(10, 5), 4, 2);

        return stringCheck("toString()", r.toString(), "[8.0/4.0,12.0/6.0]");
    }

    public static boolean test() {
        return (
                mitteTest()
                && breiteTiefeTest()
                && flaecheTest()
                && umfangTest()
                && durchmesserTest()
                && eckeTest()
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
