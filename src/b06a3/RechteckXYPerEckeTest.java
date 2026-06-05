package b06a3;

public class RechteckXYPerEckeTest {

    public static boolean breiteCheck(RechteckXYPerEcke r, double erw) {
        double erg = r.breite();
        boolean istKorrekt = Math.abs(erg - erw) < 0.0001;

        if (!istKorrekt) {
            System.out.println("FEHLER: breite()==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean breiteTest() {
        return ( breiteCheck( new RechteckXYPerEcke( new Punkt2D(1, 2), new Punkt2D(5, 7)), 4) );
    }

    public static boolean tiefeCheck(RechteckXYPerEcke r, double erw) {
        double erg = r.tiefe();
        boolean istKorrekt = Math.abs(erg - erw) < 0.0001;

        if (!istKorrekt) {
            System.out.println("FEHLER: tiefe()==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean tiefeTest() {
        return ( tiefeCheck( new RechteckXYPerEcke( new Punkt2D(1, 2), new Punkt2D(5, 7) ), 5 ) );
    }

    public static boolean mitteCheck(RechteckXYPerEcke r, Punkt2D erw) {
        Punkt2D erg = r.mitte();
        boolean istKorrekt = Math.abs(erg.x() - erw.x()) < 0.0001 && Math.abs(erg.y() - erw.y()) < 0.0001;

        if (!istKorrekt) {
            System.out.println("FEHLER: mitte()==(" + erg.x() + "," + erg.y() + ") statt (" + erw.x() + "," + erw.y() + ")");
        }
        return istKorrekt;
    }

    public static boolean mitteTest() {
        return ( mitteCheck( new RechteckXYPerEcke( new Punkt2D(1, 1), new Punkt2D(5, 5) ), new Punkt2D(3, 3) ) );
    }

    public static boolean durchmesserCheck(RechteckXYPerEcke r, double erw) {
        double erg = r.durchmesser();
        boolean istKorrekt = Math.abs(erg - erw) < 0.0001;
        if (!istKorrekt) {
            System.out.println("FEHLER: durchmesser()==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean durchmesserTest() {
        return ( durchmesserCheck( new RechteckXYPerEcke( new Punkt2D(0, 0), new Punkt2D(3, 4) ), 5 ) );
    }

    public static boolean umfangCheck(RechteckXYPerEcke r, double erw) {
        double erg = r.umfang();
        boolean istKorrekt = Math.abs(erg - erw) < 0.0001;
        if (!istKorrekt) {
            System.out.println("FEHLER: umfang()==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean umfangTest() {
        return ( umfangCheck( new RechteckXYPerEcke( new Punkt2D(0, 0), new Punkt2D(3, 4) ), 14) );
    }

    public static boolean eckeCheck(RechteckXYPerEcke r, int e, Punkt2D erw) {
        Punkt2D erg = r.ecke(e);
        boolean istKorrekt =
                Math.abs(erg.x() - erw.x()) < 0.0001 &&
                Math.abs(erg.y() - erw.y()) < 0.0001;
        if (!istKorrekt) {
            System.out.println("FEHLER: ecke(" + e + ") falsch");
        }
        return istKorrekt;
    }

    public static boolean eckeTest() {
        RechteckXYPerEcke r = new RechteckXYPerEcke( new Punkt2D(1, 2), new Punkt2D(5, 7) );
        return (
                eckeCheck(r, 0, new Punkt2D(1, 2)) &
                eckeCheck(r, 1, new Punkt2D(1, 7)) &
                eckeCheck(r, 2, new Punkt2D(5, 7)) &
                eckeCheck(r, 3, new Punkt2D(5, 2))
                );
    }

    public static boolean test() {
        return (
                breiteTest() &
                tiefeTest() &
                mitteTest() &
                durchmesserTest() &
                umfangTest() &
                eckeTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
