package b08a4;
import b06a2.Rational;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RationalAusdruck {
    public static Rational auswertung( Rational a, char op, Rational b ){
        return switch (op) {
            case '+' -> a.add(b);
            case '-' -> a.sub(b);
            case '*' -> a.mul(b);
            case '/' -> a.div(b);
            default -> throw new IllegalArgumentException("Ungueltiger Operator");
        };
    }

    public static Rational next(Scanner sc) {
        try {
            Rational a = Rational.parse(sc.next());
            String op = sc.next();
            if (op.length() != 1) {
                throw new InputMismatchException();
            }
            Rational b = Rational.parse(sc.next());
            return auswertung(a, op.charAt(0), b);
        } catch (ArithmeticException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new InputMismatchException();
        }
    }

    public static void dialog() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie zwei Brüche und einen Operanten ein, in folgender Schreibweise: \n" +
                "GZ/GZ <op> GZ/GZ");
        while (sc.hasNext()) {
            try {
                Rational r = next(sc);
                System.out.println("= " + r);
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }
}
