package b06a2;

public class Mathe {
    public static int ggT(int a, int b){
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
