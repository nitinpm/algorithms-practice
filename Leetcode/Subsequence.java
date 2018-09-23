public class Subsequence {

    public String findSubsequence(String S, String[] D){

        String temp = "";
        //Sort the list D in descending order
        for(int i = 0; i < D.length-1; i++){
            for (int j = i+1; j < D.length; j++){
                if(D[i].length() < D[j].length()){
                    //swap
                    temp = D[i];
                    D[i] = D[j];
                    D[j] = temp;
                }
            }
        }

        int j = 0;
        String W = "";
        char a;

        for(int l = 0; l < D.length; l++){
            W = D[l];
            int i = 0;
            j = 0;

            while(i < W.length() && j < S.length()){
                a = W.charAt(i);

                if(a == S.charAt(j))
                    i++;

                j++;
            }

            if(i == W.length())
                break;
        }

        return W;
    }
}
