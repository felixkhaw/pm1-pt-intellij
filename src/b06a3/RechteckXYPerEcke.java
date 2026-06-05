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
    
    public double breite(){
        return p2.x() - p1.x();
    }

    public double tiefe(){
        return p2.y() - p1.y();
    }
    
    public Punkt2D ecke(boolean istRechts, boolean istOben){
        double x = istRechts ? p2.x() : p1.x();
        double y = istOben ? p2.y() : p1.y();
        return new Punkt2D(x, y);
    }

    public Punkt2D ecke(int e){
        return switch (e) {
            case 0 -> ecke(false, false);
            case 1 -> ecke(false, true);
            case 2 -> ecke(true, true);
            case 3 -> ecke(true, false);
            default -> throw new IllegalStateException("Unexpected value: " + e);
        };
    }
    
    public Punkt2D mitte(){
        return new Punkt2D(
                (p1.x()+p2.x())/2,
                (p1.y()+p2.y())/2
                );
    }
    
    public double durchmesser(){
        double a = Math.abs(p2.x()-p1.x());
        double b = Math.abs(p2.y()-p1.y());
        return Math.sqrt(a*a+b*b);
    }
    
    public double umfang(){
        double a = Math.abs(p2.x()-p1.x());
        double b = Math.abs(p2.y()-p1.y());
        return (2*a+2*b);
    }
    public String toString(){
        return "["+p1.toString()+","+p2.toString()+"]";
    }
}
