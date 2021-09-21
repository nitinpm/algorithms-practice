package Misc.amz;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here

        Collections.sort(repository, String.CASE_INSENSITIVE_ORDER);
        System.out.println(repository.toString());

        int queryIdx = 2;
        String customerSubQuery;
        List<List<String>> result = new ArrayList<>();
        List<String> resultSubSet = new ArrayList<>();

        while(queryIdx < customerQuery.length()){
            customerSubQuery = customerQuery.substring(0,queryIdx++);

            for(String item: repository){
                if(item.toLowerCase().contains(customerSubQuery.toLowerCase())){
                    if(resultSubSet.size() < 3)
                        resultSubSet.add(item);
                    else
                        break;
                }
            }

            result.add(resultSubSet);
            System.out.println(resultSubSet);
            resultSubSet = new ArrayList<>();
        }

        return result;
    }

}

public class SearchCustomerReview {
    public static void main(String[] args) throws IOException {

        List<String> repository = Arrays.asList("MOBILE", "Mouse", "mousepad", "moneypot", "monitor");
        String customerQuery = "mouse";

        List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

        System.out.println(result.toString());
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> repository = new ArrayList<>();

        for (int i = 0; i < repositoryCount; i++) {
            String repositoryItem = bufferedReader.readLine();
            repository.add(repositoryItem);
        }

        String customerQuery = bufferedReader.readLine();

        List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                bufferedWriter.write(result.get(i).get(j));

                if (j != result.get(i).size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}