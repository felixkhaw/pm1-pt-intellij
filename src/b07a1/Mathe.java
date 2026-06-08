package b07a1;

public class Mathe {
    // a=-3 b=-6
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
    
    // a=6, b=3
    public static int subLoop(int a, int b){
        if(a<0){
            a = -(a);
        }
        if(b<0){
            b = -(b);
        }
        while (b > 0) {
            --b;
            --a;
        }
        return a;
    }
}
