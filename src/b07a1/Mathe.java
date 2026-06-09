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
    
    // a=-6, b=-3
    public static int subLoop(int a, int b){    // Operation hängt ab von b
        // Fall: a=-3, b=3 -> -3-3 = -6
        while (b > 0) {
            --b;
            --a;
        }
        // Fall: a=-3, b=-3 -> -3-(-3) = 0
        while(b<0){
            ++b;
            ++a;
        }
        return a;
    }
}
