package b06a3;

public class RechteckXYPerEcke {
    private Punkt2D p1;
    private Punkt2D p2;
    private final double EPSILON = 0.0001;
    RechteckXYPerEcke(double xl, double xr, double yu, double yo){
        this.p1 = new Punkt2D(xl, yu);
        this.p2 = new Punkt2D(xr, yo);
    }
    
    RechteckXYPerEcke(Punkt2D p1, Punkt2D p2){
        double l = Math.min(p1.x(), p2.x());
        double r = Math.max(p1.x(),p2.x());
        double u = Math.min(p1.y(),p2.y());
        double o = Math.max(p1.y(), p2.y());
        this.p1 = new Punkt2D(l,u);
        this.p2 = new Punkt2D(r,o);
    }
    
    public boolean equals(RechteckXYPerEcke r){
        if(r == null){
            return false;
        }
        return ( 
            Math.abs(this.p1.x() - r.p1.x()) < EPSILON &&
            Math.abs(this.p1.y() - r.p1.y()) < EPSILON && 
            Math.abs(this.p2.x() - r.p2.x()) < EPSILON && 
            Math.abs(this.p2.y() - r.p2.y()) < EPSILON
        );
    }
}
