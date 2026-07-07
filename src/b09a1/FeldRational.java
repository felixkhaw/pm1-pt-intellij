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
        for ( int i = 1; i < f.length - 1; i++ ) {
            if (f[maxPos].istKleiner(f[i])) {
                maxPos = i;
            }
        }
        return maxPos;
    }
}
