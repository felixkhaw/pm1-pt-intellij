package b07a1;

public class Mathe {
    public static int addLoop(int a, int b){
        if(a<0){
            a = -(a);
        }
        while (a > 0) {
            ++b;
            --a;
        }
        return b;
    }
}
