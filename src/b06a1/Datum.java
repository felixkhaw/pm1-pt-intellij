package b06a1;

public class Datum {
    private final int t;
    private final int m;
    private final int j;

    public Datum(){
        this.j = 1;
        this.m = 1;
        this.t = 1;
    }

    public Datum(int j, int m){
        this.j = j;
        this.m = m;
        this.t = 1;
    }

    public Datum(int j, int m, int t){
        this.j = j;
        this.m = m;
        this.t = t;
    }

    public int getJahr(){
        return this.j;
    }

    public int getMonat(){
        return this.m;
    }

    public int getTag(){
        return this.t;
    }

    public boolean equals(Datum d){
        return (this.j == d.j & this.m == d.m & this.t == d.t);
    }

    public boolean istFrueher(Datum d){
        if(this.j < d.j){
            return true;
        } else {
            if(this.j == d.j & this.m < d.m){
                return true;
            } else {
                return this.j == d.j & this.m == d.m & this.t < d.t;
            }
        }
    }

    public String toString(){
        return this.j + "-" + (this.m < 10 ? "0"+this.m : this.m) + "-" + (this.t < 10 ? "0"+this.t : this.t);
    }
}
