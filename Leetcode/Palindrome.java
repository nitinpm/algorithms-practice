public class Palindrome {

    public boolean isPalindrome(int x){

        if(x<0)
            return false;
        int y = 0, z = x;


        while(x!=0){
            y = y*10 + x%10;
            x = x/10;
        }

       return z == y;
    }
}
