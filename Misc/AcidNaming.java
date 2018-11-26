package Misc;

import java.util.*;

public class AcidNaming {

    static String acidNaming(String acid_name) {
        // Complete this function
        int hydro = 0, ic = 0;
        char[] h = {'h','y','d','r','o'};

        if(acid_name.length()>=5) {
            hydro = 1;
            for (int i = 0; i < 5; i++) {
                if (acid_name.charAt(i) != h[i]) {
                    hydro = 0;
                    break;
                }
            }
        }

        if ((acid_name.charAt(acid_name.length()-2) == 'i') && (acid_name.charAt(acid_name.length()-1) == 'c'))
            ic = 1;

        if(hydro == 1 && ic == 1)
            return "non-metal acid";
        else if(hydro == 0 && ic == 1)
            return "polyatomic acid";
        else
            return "not an acid";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
