package b07a2;

public class Mathe {
    public static int addRek(int a, int b){
        if ( a > 0) {
            return addRek( --a, ++b );
        }
        if ( a < 0 ) {
            return addRek( ++a, --b );
        }
        return b;
    }
    public static int subRek(int a, int b){
        if ( b > 0) {
            return subRek( --a, --b );
        }
        if ( b < 0 ) {
            return subRek( ++a, ++b );
        }
        return a;
    }
    public static int mulRek(int a, int b){
        boolean p = ( a < 0 ) == ( b < 0 );
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        int e = mulRekPositiv(a, b);
        return p ? e : -e;
    }
    private static int mulRekPositiv(int a, int b){
        if ( b == 0 ) {
            return 0;
        }
        return addRek( a, mulRekPositiv(a, --b) );
    }
}
