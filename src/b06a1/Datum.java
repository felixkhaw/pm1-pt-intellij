package b06a1;

public class Datum {
    private int t;
    private int m;
    private int j;

    public Datum(){
        this.j = 1;
        this.m = 1;
        this.t = 1;
    }

    public Datum(int j, int m){
        this.j = 1;
        this.m = 1;
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
        // Wie kann ich am besten die Abfrage machen?
        return (this.j < d.j & this.m < d.m & this.t < d.t); // ist noch falsch
    }
}
