package b10a5;

import b06a3.Punkt2D;

public interface Figur {
    
    Punkt2D mitte();
    
    double durchmesser();

    double umfang();

    double flaeche();

    boolean istEnthalten(Punkt2D p);

    Figur verschiebe(double dx, double dy);
    

}
