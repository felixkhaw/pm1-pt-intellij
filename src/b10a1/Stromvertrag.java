package b10a1;

public class Stromvertrag {
    private int fixkosten = 1000;
    private int varpreis = 30;
    private int nummer = 1;
    private String name;
    private int monat;
    private int zaehler;
    private static int anzahl = 0;

    Stromvertrag(int m, String n, int z){
        if(m < 0 || z < 0){
            throw new IllegalArgumentException("Der Parameter m entspricht nicht den Vorgaben");
        }
        this(m, n, z, 1000, 30);
    }
    Stromvertrag(int m, String n, int z, int f, int v){
        if(m < 0 || z < 0){
            throw new IllegalArgumentException("Der Parameter m entspricht nicht den Vorgaben");
        }
        monat = m;
        name = n;
        zaehler = z;
        ++anzahl;
        nummer=anzahl;
        fixkosten=f;
        varpreis=v;
    }

    public static int anzahl(){
        return anzahl;
    }

    public int nummer(){
        return nummer;
    }

    public int monat(){
        return monat;
    }

    public int zaehler(){
        return zaehler;
    }

    public int kostenFix( int a ){
        return a * fixkosten;
    }

    public int kostenVariabel( int a, int kwh ){
        if(a < 0 || kwh < 0){
            throw new IllegalArgumentException("Parameter sind negativ!");
        }
        return kwh*varpreis;
    }

    public int rechnung(int m, int z){
         return kostenVariabel(m - monat,z) + kostenFix(m - monat);
    }
}
