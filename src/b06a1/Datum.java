package b06a1;

public class Datum {
    private static final String[] monate = {
            "Januar",
            "Februar",
            "Maerz",
            "April",
            "Mai",
            "Juni",
            "Juli",
            "August",
            "September",
            "Oktober",
            "November",
            "Dezember"
    };
    private final int t;
    private final int m;
    private final int j;
    private static String f_rf = "jmt";
    private static char f_tz = '-';

    public Datum() {
        this(1, 1, 1);
    }

    public Datum(int j) {
        this(j, 1, 1);
    }

    public Datum(int j, int m) {
        this(j, m, 1);
    }

    public Datum(int j, int m, int t) {
        this.j = j;
        this.m = m;
        this.t = t;
    }

    public Datum(Datum d) {
        this(d.j, d.m, d.t);
    }

    public int jahr() {
        return this.j;
    }

    public int monat() {
        return this.m;
    }

    public int tag() {
        return this.t;
    }

    public static String nameFuerMonat(int z){
        if( z < 1 || z > 12){
            return null;
        }
        return monate[z-1];
    }

    public static int monatFuerName(String s){
        if (s == null) {
            return -1;
        }
        for (int i = 0; i < monate.length; ++i) {
            if (monate[i].equals(s)) {
                return i + 1;
            }
        }
        return -1;
    }

    public boolean equals(Datum d) {
        return this.j == d.j && this.m == d.m && this.t == d.t;
    }

    public boolean istFrueher(Datum d) {
        if (this.j < d.j) return true;
        if (this.j > d.j) return false;

        if (this.m < d.m) return true;
        if (this.m > d.m) return false;

        return this.t < d.t;
    }

    public String toString() {
        String tag;
        String monat;
        String jahr = "" + j;
        char trenner = f_tz;

        if( f_tz == '0' ){
            tag = t + ".";
            monat = nameFuerMonat(m);
            trenner = ' ';
        } else {
            tag = t < 10 ? "0" + t : "" + t;
            monat = m < 10 ? "0" + m : "" + m;
        }

        if (f_rf.equals("tmj")) {
            return tag + trenner + monat + trenner + jahr;
        }

        if (f_rf.equals("mtj")) {
            return monat + trenner + tag + trenner + jahr;
        }

        return jahr + trenner + monat + trenner + tag;
    }

    public static void setFormatRF(String s) {
        f_rf = s;
    }

    public static void setFormatTZ(char c) {
        f_tz = c;
    }
}