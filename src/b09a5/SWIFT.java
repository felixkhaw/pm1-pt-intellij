package b09a5;

public class SWIFT {

    public static String iban(String lk, int blz, long kn){
        lk = landeskuerzel(lk);
        String b = bban(blz, kn);
        String p = pruefzahl(lk, b);
        return lk + p + b;
    }

    public static String landeskuerzel(String s){
        return s.toUpperCase();
    }

    public static String bankleitzahl(int z){
        String s = String.valueOf(z);
        while (s.length() < 8) {
            s = "0" + s;
        }
        return s;
    }

    public static String kontonummer(long z){
        String s = String.valueOf(z);
        while (s.length() < 10) {
            s = "0" + s;
        }
        return s;
    }

    public static String bban(int blz, long kn){
        return bankleitzahl(blz) + kontonummer(kn);
    }

    public static int zahlFuerUpper(char c){
        return (c - 'A') + 10;
    }

    public static String bbanErgaenzung(String lk){
        lk = landeskuerzel(lk);
        return ""
                + zahlFuerUpper(lk.charAt(0))
                + zahlFuerUpper(lk.charAt(1))
                + "00";
    }

    public static int zahlAlsStringMod97(String s){
        while(s.length() > 9){
            String vorne = s.substring(0, 9);
            long wert = Long.parseLong(vorne);
            int mod = (int)(wert % 97);
            String rest = s.substring(9);
            s = mod + rest;
        }
        return (int)(Long.parseLong(s) % 97);
    }

    public static String pruefzahl(String lk, String bban){
        String z = bban + bbanErgaenzung(lk) ;
        int mod = zahlAlsStringMod97(z);
        int pruef = 98 - mod;
        String s = String.valueOf(pruef);
        while (s.length() < 2) {
            s = "0" + s;
        }
        return s;
    }
}
