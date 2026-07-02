package b10a3;

import b06a3.Punkt2D;

public class RechteckXYPerMitteLaengen extends FigurPerMitte{
    private final double breite;
    private final double tiefe;

    public RechteckXYPerMitteLaengen(Punkt2D p, int b, int t){
        super(p);

        if (b < 0 || t < 0) {
            throw new IllegalArgumentException();
        }

        breite = b;
        tiefe = t;
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
        // Letzter Punkt
        return false;
    }

    public Figur verschiebe(double dx, double dy) {
        return null;
    }

    public String toString() {
        return "";
    }
}
