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
        /*
        *  if(b == 0){
        *   return a;
        *  }
        *  return addRek(++a, --b);
        * */
    }
    
    public static int subRek(int a, int b){
        if ( b > 0) {
            return subRek( --a, --b );
        }
        if ( b < 0 ) {
            return subRek( ++a, ++b );
        }
        return a;
        /*
        * if(b==0) return a;
        * return subRec(--a, --b);
        *
        * */
    }
    
    public static int mulRek(int a, int b){
        boolean p = ( a < 0 ) == ( b < 0 );
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        int e = mulRekPositiv(a, b);
        return p ? e : -e;
        /*
        * if( b < 0 ){
        *   return mulRecHelp(-a, -b);
        * }
        * return mulRecHelp(a, b);
        *
        * */
    }
    
    private static int mulRekPositiv(int a, int b){
        if ( b == 0 ) {
            return 0;
        }
        return addRek( a, mulRekPositiv(a, --b) );
    }
    
    public static int divRek(int a, int b) {
        if (b == 0) {
            return -1;
        }
        boolean p = (a < 0) == (b < 0);
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        int e = divRekPositiv(a, b);
        return p ? e : -e;
    }
    
    private static int divRekPositiv(int r, int b) {
        if (r < b) {
            return 0;
        }
        return addRek(1, divRekPositiv(subRek(r, b), b));
    }
    
    public static int modRek(int a, int b) {
        if (b == 0) {
            return -1;
        }
        boolean p = (a > 0);
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        int r = modRekPositiv(a, b);
        return p ? r : -r;
    }
    
    private static int modRekPositiv(int r, int b) {
        if (r < b) {
            return r;
        }
        return modRekPositiv(subRek(r, b), b);
    }
    
    public static int powRek(int b, int e) {
        if (e < 0) {
            return -1;
        }
        if (e == 0) {
            return 1;
        }
        return mulRek(b, powRek(b, --e));
    }
}
