package b07a3;

public class Mathe {
    public static int powLoop(int a, int b) {
        if (b < 0) {
            return -1;
        }
        int e = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                e = e * a;
            }
            a = a * a; // *=
            b = b / 2; // /=
        }
        return e;
    }
    public static int powRek(int a, int b) {
        if (b < 0) {
            return -1;
        }
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return powRek(a * a, b / 2);
        }
        return powRek(a * a, b / 2) * a;
    }
}
