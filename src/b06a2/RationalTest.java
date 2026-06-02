package b06a2;

public class RationalTest {
    static void main(String[] args) {
        Rational r1 = new Rational(5,7);
        Rational r2 = new Rational(7,5);
        System.out.println(r1.add(r2).toString());
    }
}
