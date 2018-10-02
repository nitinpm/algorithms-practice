package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

class KadanesAlgorithm{
    public static void main(String[] args) {
        //Code for scanning the input
        Scanner scanner = new Scanner(System.in);
        int T, N;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        T = scanner.nextInt();
        int i = 0;
        while(i<T){
            N = scanner.nextInt();
            for(int j=0;j<N;j++)
                input.add(scanner.nextInt());

            result.add(maxSumContiguous(input));

            input.clear();

            i++;
        }

        System.out.println(result);
    }

    static int maxSumContiguous(ArrayList<Integer> in){

        int maxSoFar = -101;
        int maxEndingHere = 0;

        for (int item : in ) {
            maxEndingHere = maxEndingHere + item;

            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;

            if(maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

}