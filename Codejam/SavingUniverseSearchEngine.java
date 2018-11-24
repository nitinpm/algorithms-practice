package Codejam;

import java.util.*;
import java.io.*;

public class SavingUniverseSearchEngine {

    public static void main(String[] args) {



        String curDir = System.getProperty("user.dir");
        Scanner in = null;
        try {
            in = new Scanner(new BufferedReader(new FileReader(new File(curDir + "\\Codejam\\savingUniverse.in"))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int t = in.nextInt();  // Test Cases
        for (int i = 1; i <= t; ++i) {

            List<String> searchEngines = new ArrayList<>();
            List<String> searchQueries = new ArrayList<>();

            int n = in.nextInt();    //search engines
            if(n>0) {
                in.next();
                for (int j = 0; j < n; j++) {
                    searchEngines.add(in.nextLine());
                }
            }


            int q = in.nextInt();   //search queries

            if(q>0) {
                in.next();
                for (int k = 0; k < q; k++) {
                    searchQueries.add(in.nextLine());
                }
            }

            //Find the minimum switches and print
            int result = findSwitches(searchEngines, searchQueries);
//            System.out.println("Engines: "+searchEngines.toString());
//            System.out.println("Queries: "+searchQueries.toString());
//            System.out.println();
            System.out.println("Case #" + i + ": " + result);
        }

    }

    static int findSwitches(List searchEngines, List searchQueries){

        if(searchEngines.size() == 0 || searchQueries.size() == 0)
            return 0;



        return 1;
    }
}
