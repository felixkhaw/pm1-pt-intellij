package b09a2;

import java.util.Arrays;

public class FeldTest {
    public static boolean umkehrenCheck(int[] f, int[] erw) {
        int[] erg = Feld.umkehren(f);
        boolean istKorrekt = Arrays.equals(erg, erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: umkehren(...) == "
                    + Arrays.toString(erg)
                    + " statt "
                    + Arrays.toString(erw));
        }
        return istKorrekt;
    }

    public static boolean umkehrenTest() {
        return (
                umkehrenCheck(new int[]{}, new int[]{}) &&
                umkehrenCheck(new int[]{1}, new int[]{1}) &&
                umkehrenCheck(new int[]{3, 1, 8, 5}, new int[]{5, 8, 1, 3}) &&
                umkehrenCheck(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1})
        );
    }

    public static boolean test() {
        return umkehrenTest();
    }

    public static void main(String[] args) {
        if (test()) {
            System.out.println("OK");
        }
    }
}
