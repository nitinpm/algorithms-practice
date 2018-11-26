package Misc;

import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;

public class MonthlyPaymentCalc {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        Vector<Integer> input = new Vector<>();

        String[] ip = line.split("~");
        for(int j = 0; j < ip.length; j++)
            System.out.println(ip[j] + " ");


        for(int j = 0; j < ip.length; j++) {
            input.add(j, Integer.parseInt(ip[j]));
            System.out.println(input.get(j));
        }



        float loanAmount = input.get(0) - input.get(3);
        float totalTerm = input.get(1)*12;
        float monthlyRate = input.get(2)/(totalTerm*100);

        double result = (monthlyRate*loanAmount) / (1 - Math.pow((1+monthlyRate),-totalTerm));

        System.out.println("$" + result);


    }

}
