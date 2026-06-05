package b06a1;

public class Datum {
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
        String jahr = "" + this.j;
        String monat = this.m < 10 ? "0" + this.m : "" + this.m;
        String tag = this.t < 10 ? "0" + this.t : "" + this.t;

        if (f_rf.equals("tmj")) {
            return tag + f_tz + monat + f_tz + jahr;
        }

        if (f_rf.equals("mtj")) {
            return monat + f_tz + tag + f_tz + jahr;
        }

        return jahr + f_tz + monat + f_tz + tag;
    }

    public static void setFormatRF(String s) {
        f_rf = s;
    }

    public static void setFormatTZ(char c) {
        f_tz = c;
    }
}