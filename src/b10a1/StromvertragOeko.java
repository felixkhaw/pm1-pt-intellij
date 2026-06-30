package b10a1;

public class StromvertragOeko extends Stromvertrag {
    private static int anzahl = 0;

    StromvertragOeko(int m, String n, int z){
        ++anzahl;
        super(m, n, z, 1200, 35);
    }

    public static int anzahl(){
        return anzahl;
    }
}
