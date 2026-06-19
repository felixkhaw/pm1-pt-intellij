package b08a5;

public class Mathe {
    public static double pi1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        double s = 0.0;
        double v = 1;
        for (int k = 0; k <= n; k++) {
            s = s + v * (1.0 / ((2 * k) + 1));
            v = -v;
        }
        return 4 * s;
    }
    public static double pi2(double eps) {
        if (eps <= 0 || eps > 1) {
            throw new IllegalArgumentException();
        }
        double summe = 0.0;
        int v = 1;
        int k = 0;
        double summand;

        do {
            summand = v * (1.0 / (2 * k + 1));
            summe += summand;
            ++k;
            v = -v;
        } while (Math.abs(v * (1.0 / (2 * k + 1))) >= eps);
        return 4 * summe;
    }
    public static double pi2() {
        return pi2(0.00000001);
    }
}
