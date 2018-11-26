package Misc;

import java.util.HashMap;
import java.util.Scanner;

public class DateQtyProduct {
    public static void main(String args[]) {
        String input;
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> dateAmount= new HashMap<>();
        HashMap<String, Integer> dateProductCount= new HashMap<>();

        while(in.hasNextLine()) {
            input = in.nextLine();
            String[] line = input.split(",");
            String date = line[0].toString();
            int qty = Integer.parseInt(line[1]);
            String product = line[2];

            System.out.println(date + "\n" + qty + "\n" + product);
        }
    }
}
