package b09a1;
import b06a2.Rational;

import java.util.Arrays;

public class FeldRational {
    public static boolean istHomogen( Rational[] f ){
        if(f == null) throw new NullPointerException();
        for(int i = 1; i < f.length; i++){
            if( !( f[0].equals(f[i]) ) ){
                return false;
            }
        }
        return true;
    }
    
    public static boolean istSortiert( Rational[] f ){
        if ( f == null ) throw new NullPointerException();
        if ( f.length == 0 ) return true;
        for ( int i = 0; i < f.length - 1; i++ ) {
            if ( f[i+1].istKleiner(f[i]) ) return false;
        }
        return true;
    }
    
    public static int maxPos(Rational[] f) {
        int maxPos = 0;
        for ( int i = 1; i < f.length; i++ ) {
            if (f[maxPos].istKleiner(f[i])) {
                maxPos = i;
            }
        }
        return maxPos;
    }
    public static Rational maxElement(Rational[] f) {
        return f[maxPos(f)];
    }
    
    public static Rational[] max(Rational[] f1, Rational[] f2){
        if(f1.length != f2.length) throw new IllegalArgumentException();
        Rational[] maximal = new Rational[f1.length];
        for(int i = 0; i < f1.length; i++ ){
            if(f1[i].istKleiner(f2[i])){
                maximal[i] = f2[i];
            } else {
                maximal[i] = f1[i];
            }
        }
        return maximal;
    }
}
