package b10a3;

import b06a3.Punkt2D;

public abstract class Figur {

    public Figur(){

    }

    public Figur(Figur f){
        if (f == null) {
            throw new NullPointerException();
        }
    }

    public abstract Punkt2D mitte();

    public abstract int durchmesser();

    public abstract int umfang();

    public abstract int flaeche();

    public abstract boolean istEnthalten(Punkt2D p);

    public abstract Figur verschiebe(double dx, double dy);

    public abstract String toString();

}
