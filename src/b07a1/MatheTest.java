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
        return (    addLoopCheck(3,6,9) &
                    addLoopCheck(-3,6,9) &
                    addLoopCheck(-3,-6,9)    );
    }

    public static boolean test(){
        return addLoopTest();
    }

    static void main() {
        if(test()){
            System.out.println("OK");
        }
    }
}
