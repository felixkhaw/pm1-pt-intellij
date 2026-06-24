package b09a3;

public class DynFeldVonInt {
    private int[] dynarr;

    DynFeldVonInt(int al){
        this.dynarr = new int[al];
    }

    public int[] insert(int i, int k) {
        int[] tmpArr = new int[this.dynarr.length+k];
        for(int u = 0; u < this.dynarr.length; ++u){
                if(u < i){
                    tmpArr[u] = this.dynarr[u];
                } else {
                    tmpArr[u+k] = this.dynarr[u];
                }
        }
        this.dynarr = tmpArr;
        return this.dynarr;
    }

    public int length(){
       return dynarr.length;
    }

    public int get(){

    }
}
