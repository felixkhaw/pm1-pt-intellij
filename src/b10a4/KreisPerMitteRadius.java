package b10a4;

import b06a3.Punkt2D;
import b10a3.FigurPerMitte;

public class KreisPerMitteRadius extends FigurPerMitte {

    private int radius;

    public KreisPerMitteRadius(Punkt2D p, int r){
        super(p);

        if (r < 0) {
            throw new IllegalArgumentException();
        }

        radius = r;
    }

    public KreisPerMitteRadius(KreisPerMitteRadius kpm){
        this(kpm.mitte(), kpm.radius());
    }

    public int radius(){
        return radius;
    }

    public double umfang() {
        return Math.PI * durchmesser();
    }

    public double flaeche() {
        return Math.PI * radius * radius;
    }

    public double durchmesser(){
        return 2 * radius;
    }

    public String toString(){
        return "[ " + mitte() + ", " + radius() + " ]";
    }
}
