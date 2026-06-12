package b07a4;

public class Zeichenkette {
    
    public static boolean istPalindromLoop(String s){
        int l = 0;
        int r = s.length() -1;
        while( l < r ){
            if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                ++l;
                --r;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean istPalindromRek(String s){
       return false;
    }
    public static boolean istPalindromRekHilfe(String s, int l, int r){
        return false;
    }
}
