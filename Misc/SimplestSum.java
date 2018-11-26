package Misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SimplestSum {

    static int simplestSum(int k, int a, int b) {
        // Complete this function
        int S = 0;

        if(a > k) {
            if(b > a)
                S = S + (b - a + 1) * (k + 2);
            else
                S = 1;
        }
        else { //a <= k
            if(b > a)
                S = S +
                        ((b > k ? b-k : 0) * (k + 2))                       //no of k+2 multipliers

                                    + (b > k ? k - a + 1 : b - a + 1);                      //no of 1s
            else
                S = 1;
        }

        return S%(1000000007);

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int result = simplestSum(k, a, b);
            System.out.println(result);
        }
        in.close();
    }
}
