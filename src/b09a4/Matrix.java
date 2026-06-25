package b09a4;

public class Matrix {

    public double[][] m;

    Matrix(int n){
        m = new double[n][n];
        for(int a = 0; a < m.length; ++a ){
            for(int i = 0; i < m[0].length; ++i) {
                m[a][i] = 0.0;
            }
        }
    }

    Matrix(int z, int s){
        m = new double[z][s];
    }

    Matrix(Matrix r){
        m = new double[r.m.length][r.m[0].length];
        for(int a = 0; a < r.m.length; ++a ){
            for(int i = 0; i < r.m[0].length; ++i){
                m[a][i] = r.m[a][i];
            }
        }
    }

    public int zeilen(){
        return m.length;
    }

    public int spalten(){
        return m[0].length;
    }

    public Matrix set(int z, int s, double e){
        m[z][s] = e;
        return this;
    }

    public Matrix setAll(double e){
        for(int a = 0; a < m.length; ++a ){
            for(int i = 0; i < m[0].length; ++i){
                m[a][i] = e;
            }
        }
        return this;
    }

    public Matrix setZeile(int z, double[] f){
        if(m[z].length != f.length){
            throw new IllegalArgumentException("Ungültige Länge des Arrays");
        }
        for( int a = 0; a < f.length; ++a ){
            m[z][a] = f[a];
        }
        return this;
    }

    public Matrix setSpalte(int s, double[] f){
        if(m.length != f.length){
            throw new IllegalArgumentException("Ungültige Länge des Arrays");
        }
        for( int a = 0; a < f.length; ++a ){
            m[a][s] = f[a];
        }
        return this;
    }
    public boolean equals(Matrix m){
        // liefert als Wahrheitswert, ob die Matrix in Struktur und Werten gleich der
        //als Argument gegebenen Matrix ist.
    }
}
