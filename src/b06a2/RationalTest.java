package b06a2;

public class RationalTest {
    static void main(String[] args) {
        Rational r1 = new Rational(5,7);
        Rational r2 = new Rational(3,4);
        System.out.println(r1.istKleiner(r2));
    }
}
