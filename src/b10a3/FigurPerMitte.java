package b10a3;

import b06a3.Punkt2D;

public abstract class FigurPerMitte extends Figur {
    private final Punkt2D mp;

    public FigurPerMitte(Punkt2D p){
        mp = new Punkt2D(p.x(),p.y());
    }

    public FigurPerMitte(FigurPerMitte fpm){
        super(fpm);
        mp = new Punkt2D(fpm.mp.x(), fpm.mp.y());
    }

    public Punkt2D mitte() {
        return new Punkt2D(mp.x(), mp.y());
    }
}
