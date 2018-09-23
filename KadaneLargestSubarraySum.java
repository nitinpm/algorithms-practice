import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KadaneLargestSubarraySum {

    public static void main(String args[]) {
        Vector<Integer> input = new Vector<>();
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Matcher m = Pattern.compile("-?[0-9]+").matcher(line);
        while(m.find())
            input.add(Integer.parseInt(m.group()));


        int maxTillHere = 0, maxCalc = 0;

        for(int j = 0; j < input.size(); j++){
            maxCalc = maxCalc + input.get(j);

            if(maxTillHere < maxCalc)
                maxTillHere = maxCalc; //update maxTillHere only when it is greater than the maxCalc

            if(maxCalc < 0)
                maxCalc = 0;
        }

        System.out.println(maxTillHere);



    }
}
