package b06a2;

public class Rational {
    private final int z;
    private final int n;

    public Rational() {
        this(0,1);
    }
    public Rational(int z, int n){
        if(n < 0){
            n = n * (-1);
            z = z * (-1);
        }
        int f = Mathe.ggT(Math.abs(z),Math.abs(n));
        this.z = z / f;
        this.n = n / f;
    }

    public int zaehler(){
        return this.z;
    }

    public int nenner(){
        return this.n;
    }

    public boolean istKleiner(Rational r){
        if(this.nenner() != r.nenner()){
            return this.zaehler() * r.nenner() < r.zaehler() * this.nenner();
        }
        return this.zaehler() < r.zaehler();
    }

    public Rational abs(){
        int l_z = this.z;
        int l_n = this.n;

        if( l_z < 0 ){
            l_z = l_z * (-1);
        }

        if( l_n < 0 ){
            l_n = l_n * (-1);
        }
        return new Rational(l_z,l_n);
    }

    public Rational rez(){
        return new Rational(this.nenner(), this.zaehler());
    }

    public Rational add(Rational r){
        return new Rational((this.zaehler()*r.nenner()+r.zaehler()*this.nenner()),(this.nenner()*r.nenner()));
    }

    public String toString(){
        return this.z + "/" + this.n;
    }
}
