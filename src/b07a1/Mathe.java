package b07a1;

public class Mathe {
    public static int addLoop( int a, int b ) {
        while (a > 0) {
            ++b;
            --a;
        }
        while ( a < 0 ) {
            --b;
            ++a;
        }
        return b;
    }

    public static int subLoop( int a, int b ){    // Operation hängt ab von b
        while ( b > 0 ) {
            --b;
            --a;
        }
        while( b < 0 ){
            ++b;
            ++a;
        }
        return a;
    }
    
    public static int mulLoop(int a, int b) {
        boolean p = ( a < 0 ) == ( b < 0 ); // Vorzeichen ermitteln
        a = Math.abs( a );
        b = Math.abs( b );
        int c = 0;
        int e = 0;
        while( c < b ) {
            e = addLoop( e, a );
            ++c;
        }
        return p ? e : -( e );
    }
    public static int divLoop( int a, int b ) {
        if( b == 0 ) {
            return -1;
        }
        boolean p = (a < 0) == (b < 0); // Vorzeichen ermitteln
        a = Math.abs( a );
        b = Math.abs( b );
        int c = 0;
        int e = 0;
        int r = a;
        while( r >= b ) {
            r = subLoop( r , b );
            ++e;
        }
        return p ? e : -( e );
    }
}
