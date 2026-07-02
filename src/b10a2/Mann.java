package b10a2;

public class Mann extends Mensch {

    private static int anz;

    public Mann(String n, int a, int gr, int ge){
        super(n, a, gr, ge);
        ++anz;
    }

    public static int anzahl(){
        return anz;
    }
    public String chromosomen(){
        return "XY";
    }

    public int gewicht(){
        return super.gewicht() + 5;
    }

    @Override
    public int preisHaarschnitt() {
        return Math.round(10 + alter() / 4.0f);
    }
}
