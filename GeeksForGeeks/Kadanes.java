package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

class KadanesAlgorithm{
    public static void main(String[] args) {
//        //Code for scanning the input
//        Scanner scanner = new Scanner(System.in);
//        int T, N;
//        ArrayList<Integer> result = new ArrayList<>();
//        ArrayList<Integer> input = new ArrayList<>();
//        T = scanner.nextInt();
//        int i = 0;
//        while(i<T){
//            N = scanner.nextInt();
//            for(int j=0;j<N;j++)
//                input.add(scanner.nextInt());
//
//            result.add(maxSumContiguous(input));
//
//            input.clear();
//
//            i++;
//        }
//
//        System.out.println(result);

        int[] arr = { -4, 2, -5, 1, 2, 3, 6, -5, 1 };
        int arrSize = arr.length;
        int maxSum = maxSumArr(arr, arrSize);
        System.out.println(maxSum);
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

    static int maxSumArr(int []arr, int arrSize)
    {
        if (arrSize < 1)
        {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arrSize; i++)
        {
            if (currMax < 0)
            {
                currMax = arr[i];
            }
            else
            {
                currMax += arr[i];
            }

            if (globalMax < currMax)
            {
                globalMax = currMax;
            }
        }
        return globalMax;
    }

}