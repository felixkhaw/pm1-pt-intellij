package b09a5;

public class SWIFT {

    public static String iban(String lk, int blz, long kn){
        lk = landeskuerzel(lk);
        String b = bban(blz, kn);
        String p = pruefzahl(lk, b);
        return lk + p + b;
    }

    public static String landeskuerzel(String s){
        if(s == null || s.length() != 2) throw new IllegalArgumentException("String hat nicht die richtige laenge!!!");
        return s.toUpperCase();
    }

    public static String bankleitzahl(int z){
        if(z < 10000000 || z > 99999999) throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
        String s = String.valueOf(z);
        while (s.length() < 8) {
            s = "0" + s;
        }
        return s;
    }

    public static String kontonummer(long z){
        if(z <= 0 || z > 9999999999L) throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
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
        if(c < 'A' || c > 'Z') throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
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
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
            }
        }
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
        if (bban == null || bban.length() != 18) {
            throw new IllegalArgumentException("Parameter hat nicht das gewuenschte Format");
        }
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
