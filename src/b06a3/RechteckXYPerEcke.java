package b06a3;

public class RechteckXYPerEcke {
    private Punkt2D lu;
    private Punkt2D ro;
    RechteckXYPerEcke(int lux, int luy, int rox, int roy){
        this.lu = new Punkt2D(lux, luy);
        this.ro = new Punkt2D(rox, roy);
    }
    
    RechteckXYPerEcke(Punkt2D lu, Punkt2D ro){
        this.lu = lu; // Noch nicht richtig
        this.ro = ro; // Das Gleiche
    }
}
