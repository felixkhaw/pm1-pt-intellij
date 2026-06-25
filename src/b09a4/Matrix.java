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


}
