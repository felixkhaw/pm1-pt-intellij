package b07a1;

public class Mathe {
    // a=-3 b=-6
    public static int addLoop(int a, int b) {
        int tmp_a_us = 0;
        boolean a_us = true;
        boolean b_us = true;
        if (a < 0) {
            tmp_a_us = -(a);
            a_us = false;
        }
        if(b<0){
            b_us = false;
        }
        
        while (tmp_a_us > 0) {
            if(a_us==false & b_us == false){
                --b;
                --tmp_a_us;
            }  else {
               if(a_us==true & b_us==false){
                   
               } 
            }
        }
        return b;
    }
    
    // a=6, b=3
    public static int subLoop(int a, int b){
        if(a<0){
            a = -(a);
        }
        if(b<0){
            b = -(b);
        }
        while (b > 0) {
            --b;
            --a;
        }
        return a;
    }
}
