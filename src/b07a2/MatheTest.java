package b07a2;

public class MatheTest {

    public static boolean addRekCheck(int a, int b, int erw){
        int erg = Mathe.addRek(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: addRek(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean addRekTest(){
        return (
                addRekCheck(3, 6, 9) &
                addRekCheck(-3, 6, 3) &
                addRekCheck(3, -6, -3) &
                addRekCheck(-3, -6, -9) &
                addRekCheck(0, 6, 6)
        );
    }

    public static boolean subRekCheck(int a, int b, int erw){
        int erg = Mathe.subRek(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: subRek(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean subRekTest(){
        return (
                subRekCheck(6, 3, 3) &
                subRekCheck(6, -3, 9) &
                subRekCheck(-3, 3, -6) &
                subRekCheck(-3, -3, 0) &
                subRekCheck(0, 5, -5) &
                subRekCheck(0, -5, 5) &
                subRekCheck(5, 0, 5)
        );
    }

    public static boolean mulRekCheck(int a, int b, int erw){
        int erg = Mathe.mulRek(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: mulRek(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean mulRekTest(){
        return (
                mulRekCheck(3, 4, 12) &
                mulRekCheck(-3, 4, -12) &
                mulRekCheck(3, -4, -12) &
                mulRekCheck(-3, -4, 12) &
                mulRekCheck(0, 5, 0) &
                mulRekCheck(5, 0, 0) &
                mulRekCheck(0, -5, 0)
        );
    }

    public static boolean test(){
        return (
                addRekTest() &
                subRekTest() &
                mulRekTest()
        );
    }

    public static void main(String[] args) {
        if( test() ){
            System.out.println("OK");
        }
    }
}