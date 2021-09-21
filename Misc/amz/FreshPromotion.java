package Misc.amz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/discuss/interview-question/1002811/Amazon-or-OA-2021-or-Fresh-Promotion
 *
 * Amazon is running a promotion in which customers receive prizes for purchasing a secret combination of fruits. The combination will change each day, and the team running the promotion wants to use a code list to make it easy to change the combination. The code list contains groups of fruits. Both the order of the groups within the code list and the order of the fruits within the groups matter. However, between the groups of fruits, any number, and type of fruit is allowable. The term "anything" is used to allow for any type of fruit to appear in that location within the group.
 *
 * Consider the following secret code list: [[apple, apple], [banana, anything, banana]]
 * Based on the above secret code list, a customer who made either of the following purchases would win the prize:
 * orange, apple, apple, banana, orange, banana
 * apple, apple, orange, orange, banana, apple, banana, banana
 *
 * Write an algorithm to output 1 if the customer is a winner else output 0.
 *
 * Input
 * The input to the function/method consists of two arguments:
 * codeList, a list of lists of strings representing the order and grouping of specific fruits that must be purchased in order to win the prize for the day.
 * shoppingCart, a list of strings representing the order in which a customer purchases fruit.
 *
 * Output
 * Return an integer 1 if the customer is a winner else return 0.
 *
 * Note
 * 'anything' in the codeList represents that any fruit can be ordered in place of 'anything' in the group. 'anything' has to be something, it cannot be "nothing."
 * 'anything' must represent one and only one fruit.
 * If secret code list is empty then it is assumed that the customer is a winner.
 *
 * Example 1:
 *
 * Input: codeList = [[apple, apple], [banana, anything, banana]] shoppingCart = [orange, apple, apple, banana, orange, banana]
 * Output: 1
 * Explanation:
 * codeList contains two groups - [apple, apple] and [banana, anything, banana].
 * The second group contains 'anything' so any fruit can be ordered in place of 'anything' in the shoppingCart. The customer is a winner as the customer has added fruits in the order of fruits in the groups and the order of groups in the codeList is also maintained in the shoppingCart.
 *
 * Example 2:
 *
 * Input: codeList = [[apple, apple], [banana, anything, banana]]
 * shoppingCart = [banana, orange, banana, apple, apple]
 * Output: 0
 * Explanation:
 * The customer is not a winner as the customer has added the fruits in order of groups but group [banana, orange, banana] is not following the group [apple, apple] in the codeList.
 *
 * Example 3:
 *
 * Input: codeList = [[apple, apple], [banana, anything, banana]] shoppingCart = [apple, banana, apple, banana, orange, banana]
 * Output: 0
 * Explanation:
 * The customer is not a winner as the customer has added the fruits in an order which is not following the order of fruit names in the first group.
 *
 * Example 4:
 *
 * Input: codeList = [[apple, apple], [apple, apple, banana]] shoppingCart = [apple, apple, apple, banana]
 * Output: 0
 * Explanation:
 * The customer is not a winner as the first 2 fruits form group 1, all three fruits would form group 2, but can't because it would contain all fruits of group 1.
 *
 *
 *
 *
 *
 *
 * private static int freshPromotion(String[][] codeList, String[] shoppingCart) {
 * //        Start at 0 index for both the code list and shopping cart.
 *         int cartIdx = 0, codeIdx = 0;
 *         while (cartIdx < shoppingCart.length && codeIdx < codeList.length) {
 *             String cur = shoppingCart[cartIdx];
 * //            If the first fruit of the codeList is anything or if it matches the current fruit at the cart idx.
 *             if((codeList[codeIdx][0].equals("anything") || codeList[codeIdx][0].equals(cur)) && hasOrder(shoppingCart, cartIdx, codeList[codeIdx])){
 *                 cartIdx += codeList[codeIdx++].length;
 *             }else{
 *                 cartIdx++;
 *             }
 *         }
 * //        If the all the codeList is present then return 1, else 0.
 *         return codeIdx == codeList.length ? 1 : 0;
 *     }
 *
 *     private static boolean hasOrder(String[] shoppingCart, int idx, String[] order) {
 * //        Loop through the codeList to check if the fruits are in order.
 *         for (String s : order) {
 *             if (idx < shoppingCart.length && (s.equals("anything") || shoppingCart[idx].equals(s))){
 *                 idx++;
 *             }else{
 *                 return false;
 *             }
 *         }
 *         return true;
 *     }
 */
public class FreshPromotion {

    private static int freshPromotion(List<String> codeList, List<String> shoppingCart){
        if(codeList.isEmpty())
            return 1;

        int x = 0;
        int codeIdx = 0, cartIdx = 0;
        String[] codeListItem = codeList.get(x).split(" ");

        while(cartIdx < shoppingCart.size() && x < codeList.size()){


            if(codeIdx < codeListItem.length && (shoppingCart.get(cartIdx).equals(codeListItem[codeIdx]) || codeListItem[codeIdx].equals("anything")) && hasOrder(shoppingCart, cartIdx, codeListItem)){
                cartIdx += codeListItem.length;
                if(++x == codeList.size())
                    return 1;
                codeListItem = codeList.get(x).split(" ");
            } else {
                cartIdx++;
            }
        }

        return x == codeList.size() ? 1 : 0;
    }

    private static boolean hasOrder(List<String> shoppingCart, int cartIdx, String[] codeListItem) {
        for(String code: codeListItem){
            if(cartIdx < shoppingCart.size() && (code.equals("anything") || shoppingCart.get(cartIdx).equals(code))){
                cartIdx++;
            } else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> codeList = Arrays.asList("apple apple", "apple anything banana");
        List<String> shoppingCart = Arrays.asList("apple", "apple", "apple", "apple", "banana");
        String winner = freshPromotion(codeList, shoppingCart) == 1 ? "Winner" : "Loser";

        System.out.println(winner);
    }
}
