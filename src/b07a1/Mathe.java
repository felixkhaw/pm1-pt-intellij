package b07a1;

public class Mathe {
    public static int addLoop(int a, int b){
        if(a<0){
            a = -(a);
        }
        if(b<0){
            b = -(b);
        }
        while (a > 0) {
            ++b;
            --a;
        }
        return b;
    }
}
