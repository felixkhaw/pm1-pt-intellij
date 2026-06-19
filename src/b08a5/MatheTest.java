package b08a5;

public class MatheTest {

    public static boolean pi1Check(int n, double erw){
        double erg = Mathe.pi1(n);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: pi1(" + n + ") == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean pi2Check(double eps, double erw){
        double erg = Mathe.pi2(eps);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: pi2(" + eps + ") == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean pi2Check(double erw){
        double erg = Mathe.pi2();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: pi2() == " + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean pi1Test(){
        return (
                pi1Check(0, 4.0) &
                pi1Check(1, Mathe.pi1(1)) &
                pi1Check(2, Mathe.pi1(2)) &
                pi1Check(3, Mathe.pi1(3))
        );
    }

    public static boolean pi2Test(){
        return (
                pi2Check(1.0, 4.0) &
                pi2Check(0.5, Mathe.pi2(0.5)) &
                pi2Check(0.2, Mathe.pi2(0.2)) &
                pi2Check(0.1, Mathe.pi2(0.1))
        );
    }

    public static boolean test(){
        return (
                pi1Test() &
                pi2Test()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
