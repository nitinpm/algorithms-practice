package Misc.amz;

import java.io.*;
import java.util.*;



class FreshPromoResult {

     /* Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */



    public static int foo(List<String> codeList, List<String> shoppingCart) {
        // Write your code here
        int cartIdx = 0, codeListIdx = 0, codeIdx = 0;

        while(codeListIdx <  codeList.size() && cartIdx < shoppingCart.size()){

            String[] code = codeList.get(codeListIdx).split(" "); //Gets the one code item from codeList.

            if(code[codeIdx].equals("anything") || code[codeIdx].equals(shoppingCart.get(cartIdx))){
                
            }
        }


        return 0;
    }
}

public class AmazonFreshPromo {
    public static void main(String[] args) throws IOException {



        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = new ArrayList<>();

        for (int i = 0; i < codeListCount; i++) {
            String codeListItem = bufferedReader.readLine();
            codeList.add(codeListItem);
        }

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = new ArrayList<>();

        for (int i = 0; i < shoppingCartCount; i++) {
            String shoppingCartItem = bufferedReader.readLine();
            shoppingCart.add(shoppingCartItem);
        }

        int result = FreshPromoResult.foo(codeList, shoppingCart);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

