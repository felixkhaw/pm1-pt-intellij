package b07a1;

public class Mathe {
    public static int addLoop(int a, int b) {
        while (a > 0) {
            ++b;
            --a;
        }
        while (a < 0) {
            --b;
            ++a;
        }
        return b;
    }

    public static int subLoop(int a, int b){    // Operation hängt ab von b
        while (b > 0) {
            --b;
            --a;
        }
        while(b<0){
            ++b;
            ++a;
        }
        return a;
    }

    public static int mulLoop(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean p = (a < 0) == (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int erg = 0;
        while ( b > 0 ) {
            int i = a;
            while( i > 0 ){
                ++erg;
                --i;
            }
            --b;
        }
        return (p) ? erg : -(erg);
    }
}
