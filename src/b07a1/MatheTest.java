package b07a1;

public class MatheTest {

    public static boolean addLoopCheck(int a, int b, int erw){
        int erg = Mathe.addLoop(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: addLoop(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean addLoopTest(){
        return (
                addLoopCheck(3, 6, 9) &
                addLoopCheck(-3, 6, 3) &
                addLoopCheck(3, -6, -3) &
                addLoopCheck(-3, -6, -9) &
                addLoopCheck(0, 6, 6)
        );
    }

    public static boolean subLoopCheck(int a, int b, int erw){
        int erg = Mathe.subLoop(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: subLoop(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean subLoopTest(){
        return (
                subLoopCheck(6, 3, 3) &
                subLoopCheck(6, -3, 9) &
                subLoopCheck(-3, 3, -6) &
                subLoopCheck(-3, -3, 0) &
                subLoopCheck(0, 5, -5) &
                subLoopCheck(0, -5, 5) &
                subLoopCheck(5, 0, 5)
        );
    }

    public static boolean mulLoopCheck(int a, int b, int erw){
        int erg = Mathe.mulLoop(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: mulLoop(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean mulLoopTest(){
        return (
                mulLoopCheck(3, 4, 12) &
                mulLoopCheck(-3, 4, -12) &
                mulLoopCheck(3, -4, -12) &
                mulLoopCheck(-3, -4, 12) &
                mulLoopCheck(0, 5, 0) &
                mulLoopCheck(5, 0, 0) &
                mulLoopCheck(0, -5, 0)
        );
    }

    public static boolean divLoopCheck(int a, int b, int erw){
        int erg = Mathe.divLoop(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: divLoop(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean divLoopTest(){
        return (
                divLoopCheck(12, 3, 4) &
                divLoopCheck(13, 3, 4) &
                divLoopCheck(-13, 3, -4) &
                divLoopCheck(13, -3, -4) &
                divLoopCheck(-13, -3, 4) &
                divLoopCheck(0, 5, 0) &
                divLoopCheck(5, 1, 5) &
                divLoopCheck(5, -1, -5)
        );
    }

    public static boolean modLoopCheck(int a, int b, int erw){
        int erg = Mathe.modLoop(a, b);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: modLoop(" + a + "," + b + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean modLoopTest(){
        return (
                modLoopCheck(13, 3, 1) &
                modLoopCheck(12, 3, 0) &
                modLoopCheck(-13, 3, -1) &
                modLoopCheck(13, -3, 1) &
                modLoopCheck(-13, -3, -1) &
                modLoopCheck(0, 5, 0) &
                modLoopCheck(5, 1, 0) &
                modLoopCheck(5, -1, 0)
        );
    }

    public static boolean test(){
        return (
                addLoopTest() &
                subLoopTest() &
                mulLoopTest() &
                divLoopTest() &
                modLoopTest()
        );
    }

    public static void main(String[] args) {
        if(test()){
            System.out.println("OK");
        }
    }
}