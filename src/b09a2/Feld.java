package b09a2;

public class Feld {
    public static int[] umkehren(int[] f){
        int[] n = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            n[i] = f[f.length - 1 - i];
        }
        return n;
    }

    public static void umkehrenInPlace(int[] f){
        for(int i = 0; i < f.length / 2; i++){
            int tmp = f[i];
            f[i] = f[f.length - 1 - i];
            f[f.length - 1 - i] = tmp;

        }
    }
}
