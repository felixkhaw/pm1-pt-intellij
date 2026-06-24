package b09a3;

public class DynFeldVonInt {
    private int[] dynarr;

    DynFeldVonInt(int al){
        dynarr = new int[al];
    }

    public int[] insert(int i, int k) {
        int[] tmpArr = new int[dynarr.length+k];
        for(int u = 0; u < dynarr.length; ++u){
                if(u < i){
                    tmpArr[u] = dynarr[u];
                } else {
                    tmpArr[u+k] = dynarr[u];
                }
        }
        dynarr = tmpArr;
        return dynarr;
    }

    public int length(){
       return dynarr.length;
    }

    public int get(int i){
        return dynarr[i];
    }

    public void set(int i, int v){
        dynarr[i] = v;
    }

    public void remove(int i, int k){
        if( k<=0 ) throw new IllegalArgumentException("k darf nicht kleiner als 0 sein!");
        if( i < 0 || i >= dynarr.length ) throw new ArrayIndexOutOfBoundsException(i);
        if( i+k > dynarr.length ) throw new IllegalArgumentException("Es existieren keine k Elemente an Position i!");
        int[] tmpArr = new int[ dynarr.length-k ];
        for(int u = 0; u < dynarr.length-k; ++u){
            if(u < i){
                tmpArr[u] = dynarr[u];
            } else if(u >= i) {
                tmpArr[u] = dynarr[u+k];
            }
        }
        dynarr = tmpArr;
    }

    public boolean equals(DynFeldVonInt df){
        if(df.length() != dynarr.length) return false;
        for(int i = 0; i < df.length(); ++i){
            if(dynarr[i] != df.get(i)){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        String result = "[";
        for(int p = 0; p < dynarr.length; ++p){
            result = result + (p == 0 ? "" : " ,") + dynarr[p];
        }
        result += "]";
        return result;
    }
}
