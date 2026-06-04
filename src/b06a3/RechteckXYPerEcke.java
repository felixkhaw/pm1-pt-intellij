package b06a3;

public class RechteckXYPerEcke {
    private Punkt2D p1;
    private Punkt2D p2;
    // private final double EPSILON = 0.01; // Rundungsfehler über Math.abs(...) < EPSILON
    RechteckXYPerEcke(double xl, double xr, double yu, double yo){
        this.p1 = new Punkt2D(xl, yu);
        this.p2 = new Punkt2D(xr, yo);
    }
    
    RechteckXYPerEcke(Punkt2D p1, Punkt2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public boolean equals(){
        
    }
}
