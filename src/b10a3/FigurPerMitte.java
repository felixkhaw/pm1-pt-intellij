package b10a3;

import b06a3.Punkt2D;

public abstract class FigurPerMitte extends Figur {
    private Punkt2D mp;

    public FigurPerMitte(Punkt2D p){
        mp = new Punkt2D(p.x(),p.y());
    }
}
