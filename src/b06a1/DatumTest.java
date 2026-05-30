package b06a1;

public class DatumTest {Datum d1 = new Datum(2026,2,1);

    public static boolean equalsCheck(Datum d1, Datum d2, boolean erw){
        boolean erg = d1.equals(d2);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: equalsCheck(" + d1.getJahr() +"-"+ d1.getMonat()+"-"+d1.getTag() + "," + d2.getJahr() +"-"+ d2.getMonat()+"-"+d2.getTag() +")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean equalsTest(){
        Datum d1 = new Datum(2026,2,1);
        Datum d2 = new Datum(2026,2,1);
        Datum d3 = new Datum(2026,2,2);
        Datum d4 = new Datum(2026,3,1);
        Datum d5 = new Datum(2027,2,1);
        return (
                equalsCheck(d1,d2, true) &&
                equalsCheck(d2,d1, true) &&
                equalsCheck(d1,d3, false) &&
                equalsCheck(d1,d4, false) &&
                equalsCheck(d1,d5, false) &&
                istFrueherCheck(d1,d2, false) &&
                istFrueherCheck(d1,d3, true) &&
                istFrueherCheck(d3,d1, false) &&
                istFrueherCheck(d1,d4, true) &&
                istFrueherCheck(d4,d1, false) &&
                istFrueherCheck(d1,d5, true) &&
                istFrueherCheck(d5,d1, false)
        );
    }

    public static boolean istFrueherCheck(Datum d1, Datum d2, boolean erw){
        boolean erg = d1.istFrueher(d2);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: istFrueherCheck(" + d1.getJahr() +"-"+ d1.getMonat()+"-"+d1.getTag() + "," + d2.getJahr() +"-"+ d2.getMonat()+"-"+d2.getTag() +")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean istFrueherTest(){
        Datum d6 = new Datum(2026,2,1);
        Datum d7 = new Datum(2026,2,1);
        Datum d8 = new Datum(2026,2,2);
        Datum d9 = new Datum(2026,3,1);
        Datum d10 = new Datum(2027,2,1);
        return (
                istFrueherCheck(d6,d7, false) &&
                istFrueherCheck(d7,d8, true) &&
                istFrueherCheck(d8,d7, false) &&
                istFrueherCheck(d7,d9, true) &&
                istFrueherCheck(d9,d7, false) &&
                istFrueherCheck(d9,d10, true) &&
                istFrueherCheck(d10,d9, false)
        );
    }

    public static boolean toStringCheck(Datum d, String s, boolean erw){
        boolean erg = d.toString().equals(s);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: equalsCheck(" + d.getJahr() + "-" + d.getMonat() + "-" + d.getTag() + ", " + s +")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean toStringTest(){
        Datum d = new Datum(2026,2,1);
        return toStringCheck(d, "2026-02-01", true);
    }

    public static boolean test(){
        return (
                equalsTest() &&
                istFrueherTest() &&
                toStringTest()
        );
    }
    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
