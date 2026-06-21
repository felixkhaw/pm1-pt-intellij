package b09a1;
import b06a2.Rational;

public class FeldRational {
    public static boolean istHomogen(Rational[] f){
        if(f == null){
            throw new NullPointerException("Das übergebene Objekt ist Null !");
        }
        for(int i = 1; i < f.length; i++){
            if( !( f[0].equals(f[i]) ) ){
                return false;
            }
        }
        return true;
    }
}
