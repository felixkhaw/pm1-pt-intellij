package b10a2;

public abstract class Mensch {

    private static int anz;
    private final String name;
    private int alter;
    private int gr;
    private int gew;
    private static final int VOLLJAEHRIGKEITSALTER = 18;

    public Mensch(String n, int a, int gr, int ge){
        this.name = n;
        this.alter = a;
        this.gr = gr;
        this.gew = ge;
        ++anz;
    }

    public static int anzahl(){
        return anz;
    }

    public int alter(){
        return this.alter;
    }

    public static int volljaehrigkeitsAlter(){
        return VOLLJAEHRIGKEITSALTER;
    }

    public boolean istVolljaehrig(){
        return this.alter >= volljaehrigkeitsAlter();
    }

    public final String name() {
        return name;
    }

    public int gewicht(){
        return gew;
    }

    public int groesse(){
        return gr;
    }

    public void setAlter(int a){
        alter = a;
    }

    public void setGroesse(int g){
        gr = g;
    }

    public void setGewicht(int g){
        gew = g;
    }

    public abstract String chromosomen();

    public abstract int preisHaarschnitt();

    @Override
    public String toString() {
        return name() + " " + chromosomen() + " " + alter() + " " + istVolljaehrig() + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
    }
}
