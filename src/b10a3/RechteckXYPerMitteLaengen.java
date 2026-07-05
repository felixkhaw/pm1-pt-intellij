package b10a3;

import b06a3.Punkt2D;
import b10a5.RechteckXY;

public class RechteckXYPerMitteLaengen extends FigurPerMitte implements RechteckXY {
    private final double breite;
    private final double tiefe;

    public RechteckXYPerMitteLaengen(Punkt2D p, double b, double t){
        super(p);

        if (b < 0 || t < 0) {
            throw new IllegalArgumentException();
        }

        breite = b;
        tiefe = t;
    }

    public RechteckXYPerMitteLaengen(RechteckXYPerMitteLaengen r) {
        super(r);
        breite = r.breite;
        tiefe = r.tiefe;
    }

    public double breite() {
        return breite;
    }

    public double tiefe() {
        return tiefe;
    }

    public double flaeche() {
        return breite * tiefe;
    }

    public double umfang() {
        return 2 * breite + 2 * tiefe;
    }

    public double durchmesser() {
        return Math.sqrt(breite * breite + tiefe * tiefe);
    }

    public boolean istEnthalten(Punkt2D p) {
        if (p == null) {
            throw new NullPointerException();
        }

        Punkt2D m = mitte();

        return (
                p.x() >= m.x() - breite / 2
                && p.x() <= m.x() + breite / 2
                && p.y() >= m.y() - tiefe / 2
                && p.y() <= m.y() + tiefe / 2
        );
    }

    public Punkt2D ecke(int i) {
        switch (i) {
            case 0:
                return ecke(false, false); // links unten
            case 1:
                return ecke(true, false);  // rechts unten
            case 2:
                return ecke(true, true);   // rechts oben
            case 3:
                return ecke(false, true);  // links oben
            default:
                throw new IllegalArgumentException("ungueltige Ecke: " + i);
        }
    }

    public Punkt2D ecke(boolean istRechts, boolean istOben){
        Punkt2D m = mitte();

        double x;
        double y;

        if (istRechts) {
            x = m.x() + breite / 2;
        } else {
            x = m.x() - breite / 2;
        }

        if (istOben) {
            y = m.y() + tiefe / 2;
        } else {
            y = m.y() - tiefe / 2;
        }

        return new Punkt2D(x, y);
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        RechteckXYPerMitteLaengen r = (RechteckXYPerMitteLaengen) o;

        return (
                breite == r.breite &&
                tiefe == r.tiefe &&
                mitte().x() == r.mitte().x() &&
                mitte().y() == r.mitte().y()
        );
    }

    public String toString() {
        return "[" + ecke(false, false) + "," + ecke(true, true) + "]";
    }
}
