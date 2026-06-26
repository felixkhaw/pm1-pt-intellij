package b09a4;

import java.util.InputMismatchException;

public class Matrix {

    public double[][] m;

    public Matrix(int n){
        m = new double[n][n];
        for(int a = 0; a < m.length; ++a ){
            for(int i = 0; i < m[0].length; ++i) {
                m[a][i] = 0.0;
            }
        }
    }

    public Matrix(int z, int s){
        m = new double[z][s];
    }

    public Matrix(Matrix r){
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

        if(m == null) return false;
        if(this.m.length != m.m.length) return false;
        if(this.m[0].length != m.m[0].length) return false;

        for(int a = 0; a < m.m.length; ++a ){
            for(int i = 0; i < m.m[0].length; ++i){
                if(this.m[a][i] != m.m[a][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public String toString(){
        String result = "";
        for(int a = 0; a < m.length; ++a ){
            result += "(";
            for(int i = 0; i < m[0].length; ++i){
                result += " " + m[a][i];
            }
            result += " )\n" ;
        }
        return result;
    }

    public Matrix eingabe(java.util.Scanner sc) {
        for (int z = 0; z < m.length; z++) {
            String token = sc.next();
            if (!"(".equals(token)) throw new InputMismatchException();
            for (int s = 0; s < m[0].length; s++) {
                m[z][s] = sc.nextDouble();
            }
            token = sc.next();
            if (!")".equals(token)) {
                throw new InputMismatchException();
            }
        }
        return this;
    }
}
