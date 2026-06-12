package b07a3;

public class MatheTest {

    public static boolean powLoopCheck(int a, int b, int erw){
        int erg = Mathe.powLoop(a, b);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: powLoop(" + a + "," + b + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean powRekCheck(int a, int b, int erw){
        int erg = Mathe.powRek(a, b);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) {
            System.out.println("FEHLER: powRek(" + a + "," + b + ") == " + erg + " statt " + erw);
        }

        return istKorrekt;
    }

    public static boolean powLoopTest(){
        return (
                powLoopCheck(2, 0, 1) &
                powLoopCheck(2, 1, 2) &
                powLoopCheck(2, 3, 8) &
                powLoopCheck(2, 10, 1024) &
                powLoopCheck(3, 4, 81) &
                powLoopCheck(5, 2, 25) &
                powLoopCheck(-2, 3, -8) &
                powLoopCheck(-2, 4, 16) &
                powLoopCheck(0, 5, 0) &
                powLoopCheck(2, -1, -1)
        );
    }

    public static boolean powRekTest(){
        return (
                powRekCheck(2, 0, 1) &
                powRekCheck(2, 1, 2) &
                powRekCheck(2, 3, 8) &
                powRekCheck(2, 10, 1024) &
                powRekCheck(3, 4, 81) &
                powRekCheck(5, 2, 25) &
                powRekCheck(-2, 3, -8) &
                powRekCheck(-2, 4, 16) &
                powRekCheck(0, 5, 0) &
                powRekCheck(2, -1, -1)
        );
    }

    public static boolean test(){
        return (
                powLoopTest() &
                powRekTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}