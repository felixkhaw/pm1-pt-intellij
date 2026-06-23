package b09a3;

public class DynFeldVonInt {
    private int[] dynarr;

    DynFeldVonInt(int al){
        this.dynarr = new int[al];
    }

    public int[] insert(int i, int k) {
        int[] tmpArr = new int[this.dynarr.length+k];
        for(int u = 0; u < tmpArr.length; ++u){
                if(u == i){
                    // Noch beim überlegen
                }
                // tmpArr[/* u ist ab if nicht mehr Ziel Index*/] = this.dynarr[u];
        }
        return this.dynarr = tmpArr;
    }

    public int length(){
       return dynarr.length;
    }

}
