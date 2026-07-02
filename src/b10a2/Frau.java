package b10a2;

public class Frau extends Mensch {

    private static int anz;

    public Frau(String n, int a, int gr, int ge){
        super(n, a, gr, ge);
        ++anz;
    }

    public static int anzahl(){
        return anz;
    }

    public String chromosomen(){
        return "XX";
    }

    public int groesse(){
        return super.groesse() - 5;
    }

    @Override
    public int preisHaarschnitt() {
        return Math.round(20 + 3.0f / 2 * alter());
    }
}
