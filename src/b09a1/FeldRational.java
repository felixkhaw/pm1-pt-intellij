package b09a1;
import b06a2.Rational;

public class FeldRational {
    public static boolean istHomogen( Rational[] f ){
        if(f == null) throw new NullPointerException("Das übergebene Objekt ist Null !");
        for(int i = 1; i < f.length; i++){
            if( !( f[0].equals(f[i]) ) ){
                return false;
            }
        }
        return true;
    }
    
    public boolean istSortiert( Rational[] f ){
        if ( f == null ) throw new NullPointerException();
        if ( f.length == 0 ) return true;
        for ( int i = 0; i < f.length - 1; i++ ) {
            if ( f[i+1].istKleiner(f[i]) ) return false;
        }
        return true;
    }
    
    public static int maxPos(Rational[] f) {
        
    }
}
