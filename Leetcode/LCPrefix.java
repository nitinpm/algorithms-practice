package Leetcode;

public class LCPrefix {

    public String longestCommonPrefix(String[] strs){
        String lcp = "";
        if(strs.length > 0) {
            String smallest = strs[0];

            if(strs.length == 1)
                return smallest;

            boolean existsInAll = false;

            //find the smallest string in the array and store it in smallest.
            for (int i = 1; i < strs.length; i++)
                if (smallest.length() > strs[i].length())
                    smallest = strs[i];


            //compare each char of smallest to all string chars one by one char.
            //eg. first char of smallest compared with first of all the strings.
            for (int j = 0; j < smallest.length(); j++) {
                for (int k = 0; k < strs.length; k++) {
                    if (smallest.charAt(j) == strs[k].charAt(j))
                            existsInAll = true;
                    else {
                        existsInAll = false;
                        break;
                    }
                }

                if (existsInAll)
                    lcp += smallest.charAt(j);
                else
                    break;
            }
        }



        return lcp;
    }
}
