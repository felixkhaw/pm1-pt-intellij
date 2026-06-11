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
}
