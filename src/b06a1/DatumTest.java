package b06a1;

public class DatumTest {Datum d1 = new Datum(2026,2,1);

    public static boolean equalsCheck(Datum d1, Datum d2, boolean erw){
        boolean erg = d1.equals(d2);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: equalsCheck(" + d1.jahr() +"-"+ d1.monat()+"-"+d1.tag() + "," + d2.jahr() +"-"+ d2.monat()+"-"+d2.tag() +")==" + erg + " statt " + erw);
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
            System.out.println("FEHLER: istFrueherCheck(" + d1.jahr() +"-"+ d1.monat()+"-"+d1.tag() + "," + d2.jahr() +"-"+ d2.monat()+"-"+d2.tag() +")==" + erg + " statt " + erw);
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
            System.out.println("FEHLER: equalsCheck(" + d.jahr() + "-" + d.monat() + "-" + d.tag() + ", " + s +")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean toStringTest(){
        Datum d = new Datum(2026,2,1);
        return toStringCheck(d, "2026-02-01", true);
    }

    public static boolean staticRFTZCheck(Datum d1, Datum d2, boolean erw){
        boolean erg = d1.toString().equals(d2.toString());
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: staticRFTZCheck(" + d1.jahr() +"-"+ d1.monat()+"-"+d1.tag() + "," + d2.jahr() +"-"+ d2.monat()+"-"+d2.tag() +")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }
    public static boolean staticRFTZTest(){
        Datum d8 = new Datum();
        Datum d9 = new Datum();
        d8.setFormatRF("tmj");
        d9.setFormatTZ('/');
        return staticRFTZCheck(d8,d9,true);
    }
    public static boolean nameFuerMonatCheck(Datum d, int monat, String erw) {
        String erg = d.nameFuerMonat(monat);

        boolean istKorrekt;
        if (erg == null) {
            istKorrekt = (erw == null);
        } else {
            istKorrekt = erg.equals(erw);
        }

        if (!istKorrekt) {
            System.out.println(
                    "FEHLER: nameFuerMonat(" + monat + ") == " +
                            erg + " statt " + erw
            );
        }

        return istKorrekt;
    }

    public static boolean nameFuerMonatTest() {
        Datum d = new Datum();

        return (
                nameFuerMonatCheck(d, 1, "Januar") &&
                nameFuerMonatCheck(d, 2, "Februar") &&
                nameFuerMonatCheck(d, 3, "Maerz") &&
                nameFuerMonatCheck(d, 4, "April") &&
                nameFuerMonatCheck(d, 5, "Mai") &&
                nameFuerMonatCheck(d, 6, "Juni") &&
                nameFuerMonatCheck(d, 7, "Juli") &&
                nameFuerMonatCheck(d, 8, "August") &&
                nameFuerMonatCheck(d, 9, "September") &&
                nameFuerMonatCheck(d, 10, "Oktober") &&
                nameFuerMonatCheck(d, 11, "November") &&
                nameFuerMonatCheck(d, 12, "Dezember") &&
                nameFuerMonatCheck(d, 0, null) &&
                nameFuerMonatCheck(d, 13, null) &&
                nameFuerMonatCheck(d, -1, null)
        );
    }

    public static boolean monatFuerNameCheck(Datum d, String monat, int erw) {
        int erg = d.monatFuerName(monat);

        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println(
                    "FEHLER: monatFuerName(" + monat + ") == " +
                            erg + " statt " + erw
            );
        }

        return istKorrekt;
    }

    public static boolean monatFuerNameTest() {
        Datum d = new Datum();

        return (
                monatFuerNameCheck(d, "Januar", 1) &&
                monatFuerNameCheck(d, "Februar", 2) &&
                monatFuerNameCheck(d, "Maerz", 3) &&
                monatFuerNameCheck(d, "April", 4) &&
                monatFuerNameCheck(d, "Mai", 5) &&
                monatFuerNameCheck(d, "Juni", 6) &&
                monatFuerNameCheck(d, "Juli", 7) &&
                monatFuerNameCheck(d, "August", 8) &&
                monatFuerNameCheck(d, "September", 9) &&
                monatFuerNameCheck(d, "Oktober", 10) &&
                monatFuerNameCheck(d, "November", 11) &&
                monatFuerNameCheck(d, "Dezember", 12) &&
                monatFuerNameCheck(d, "Test", -1) &&
                monatFuerNameCheck(d, "", -1)
        );
    }

    public static boolean test(){
        return (
                equalsTest() &&
                istFrueherTest() &&
                toStringTest() &&
                staticRFTZTest() &&
                nameFuerMonatTest() &&
                monatFuerNameTest()
        );
    }
    static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}