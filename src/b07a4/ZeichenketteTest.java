package b07a4;

public class ZeichenketteTest {

    public static boolean istPalindromLoopCheck(String s, boolean erw){
        boolean erg = Zeichenkette.istPalindromLoop(s);
        boolean istKorrekt = (erg == erw);

        if (!istKorrekt) { System.out.println(
                    "FEHLER: istPalindromLoop(\"" + s + "\") == " + erg + " statt " + erw
            );
        }

        return istKorrekt;
    }
    

    public static boolean istPalindromLoopTest(){
        return (
                istPalindromLoopCheck("Rentner", true) &
                istPalindromLoopCheck("Lager-3-Regal", true) &
                istPalindromLoopCheck("4163614", true) &
                istPalindromLoopCheck("abba", true) &
                istPalindromLoopCheck("abcba", true) &
                istPalindromLoopCheck("a", true) &
                istPalindromLoopCheck("", true) &
                istPalindromLoopCheck("Hallo", false) &
                istPalindromLoopCheck("abca", false)
        );
    }

    public static boolean test(){
        return (
                istPalindromLoopTest()
        );
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}