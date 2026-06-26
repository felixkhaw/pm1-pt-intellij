package b09a4;

public class MatrixTest {

    public static boolean equalsCheck(Matrix m, Matrix erw) {
        boolean erg = m.equals(erw);
        boolean istKorrekt = erg;

        if (!istKorrekt) {
            System.out.println("FEHLER: Matrix ist nicht wie erwartet.");
        }

        return istKorrekt;
    }

    public static boolean equalsTest() {
        Matrix m1 = new Matrix(2);
        m1.set(0,0,1);
        m1.set(0,1,2);
        m1.set(1,0,3);
        m1.set(1,1,4);

        Matrix m2 = new Matrix(m1);

        Matrix m3 = new Matrix(2);
        m3.set(0,0,1);
        m3.set(0,1,2);
        m3.set(1,0,3);
        m3.set(1,1,5);

        return (
                equalsCheck(m1, m2) &&
                !m1.equals(m3)
        );
    }

    public static boolean setAllTest() {
        Matrix m = new Matrix(2);
        m.setAll(5.0);

        Matrix erw = new Matrix(2);
        erw.set(0,0,5);
        erw.set(0,1,5);
        erw.set(1,0,5);
        erw.set(1,1,5);

        return equalsCheck(m, erw);
    }

    public static boolean setZeileTest() {
        Matrix m = new Matrix(2);
        m.setZeile(1, new double[]{3,4});

        Matrix erw = new Matrix(2);
        erw.set(1,0,3);
        erw.set(1,1,4);

        return equalsCheck(m, erw);
    }

    public static boolean setSpalteTest() {
        Matrix m = new Matrix(2);
        m.setSpalte(0, new double[]{5,6});

        Matrix erw = new Matrix(2);
        erw.set(0,0,5);
        erw.set(1,0,6);

        return equalsCheck(m, erw);
    }

    public static boolean toStringTest() {
        Matrix m = new Matrix(2);
        m.set(0,0,1);
        m.set(0,1,2);
        m.set(1,0,3);
        m.set(1,1,4);

        String erw =
                "( 1.0 2.0 )\n" +
                "( 3.0 4.0 )\n";

        boolean istKorrekt = m.toString().equals(erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: toString()");
            System.out.println(m.toString());
        }

        return istKorrekt;
    }

    public static boolean test() {
        return (
                equalsTest() &&
                setAllTest() &&
                setZeileTest() &&
                setSpalteTest() &&
                toStringTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
