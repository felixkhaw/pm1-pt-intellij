package b06a2;

public class RationalTest {
    static void main(String[] args) {
        Rational r1 = new Rational(-5,7);
        Rational r2 = r1.abs();
        System.out.println(r1.zaehler()+"/"+r1.nenner());
        System.out.println(r2.zaehler()+"/"+r2.nenner());
    }
}
