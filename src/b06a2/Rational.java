package b06a2;

public class Rational {
    private final int z;
    private final int n;

    public Rational() {
        this(0,1);
    }

    public Rational(int z){
        this(z, 1);
    }

    public Rational(Rational r){
        this(r.zaehler(), r.nenner());
    }

    public Rational(int z, int n){
        if( n == 0 ){
            throw new ArithmeticException("Division durch Null ist verboten");
        }
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rational)) {
            return false;
        }

        Rational a = (Rational) obj;
        return this.zaehler() == a.zaehler()
                && this.nenner() == a.nenner();
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

        return new Rational(l_z,l_n);
    }

    public Rational rez(){
        return new Rational(
                this.nenner(), this.zaehler()
        );
    }

    public Rational add(Rational r){
        return new Rational(
                this.zaehler()*r.nenner()+r.zaehler()*this.nenner(),
                this.nenner()*r.nenner()
        );
    }

    public Rational sub(Rational r){
        return new Rational(
                this.zaehler()*r.nenner()-r.zaehler()*this.nenner(),
                this.nenner()*r.nenner()
        );
    }

    public Rational mul(Rational r){
        return new Rational(
                this.zaehler()*r.zaehler(),
                this.nenner()*r.nenner()
        );
    }

    public Rational div(Rational r){
        return new Rational(
                this.zaehler()*r.nenner(),
                this.nenner()*r.zaehler()
        );
    }

    public static Rational parse(String s){
        int p = s.indexOf('/');
        if ( p == -1) {
            throw new IllegalArgumentException("Parameter hat das falsche Format");
        }
        if (s.indexOf('/', p + 1) != -1) {
            throw new IllegalArgumentException("Parameter hat das falsche Format");
        }
        String nz = s.substring(0,p);
        String nn = s.substring(p+1);
        return new Rational(Integer.parseInt(nz), Integer.parseInt(nn));
    }

    public String toString(){
        return this.z + "/" + this.n;
    }
}
