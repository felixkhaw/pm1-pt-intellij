package b09a5;

public class SWIFTTest {

    public static boolean landeskuerzelCheck(String lk, String erw) {
        String erg = SWIFT.landeskuerzel(lk);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: landeskuerzel(\"" + lk + "\") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean bankleitzahlCheck(int blz, String erw) {
        String erg = SWIFT.bankleitzahl(blz);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: bankleitzahl(" + blz + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean kontonummerCheck(long kn, String erw) {
        String erg = SWIFT.kontonummer(kn);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: kontonummer(" + kn + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean bbanCheck(int blz, long kn, String erw) {
        String erg = SWIFT.bban(blz, kn);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: bban(...) == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean zahlFuerUpperCheck(char c, int erw) {
        int erg = SWIFT.zahlFuerUpper(c);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: zahlFuerUpper(" + c + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean bbanErgaenzungCheck(String lk, String erw) {
        String erg = SWIFT.bbanErgaenzung(lk);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: bbanErgaenzung(...) == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean mod97Check(String s, int erw) {
        int erg = SWIFT.zahlAlsStringMod97(s);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: zahlAlsStringMod97(...) == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean pruefzahlCheck(String lk, String bban, String erw) {
        String erg = SWIFT.pruefzahl(lk, bban);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: pruefzahl(...) == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean ibanCheck(String lk, int blz, long kn, String erw) {
        String erg = SWIFT.iban(lk, blz, kn);
        boolean istKorrekt = erg.equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: iban(...) == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean test() {
        return (
                landeskuerzelCheck("de", "DE") &&
                landeskuerzelCheck("Fr", "FR") &&

                bankleitzahlCheck(12345678, "12345678") &&
                bankleitzahlCheck(1234, "00001234") &&

                kontonummerCheck(123456, "0000123456") &&
                kontonummerCheck(1, "0000000001") &&

                bbanCheck(12345678, 123456, "123456780000123456") &&

                zahlFuerUpperCheck('A', 10) &&
                zahlFuerUpperCheck('D', 13) &&
                zahlFuerUpperCheck('E', 14) &&
                zahlFuerUpperCheck('Z', 35) &&

                bbanErgaenzungCheck("DE", "131400") &&

                mod97Check("123456780000123456131400", 58) &&

                pruefzahlCheck("DE", "123456780000123456", "40") &&

                ibanCheck("de", 12345678, 123456, "DE40123456780000123456")
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
