/**
Determine whether an integer is a palindrome. Do this without extra space.
*/

class Solution {
public:
    bool isPalindrome(int x) {
        int y=0;
        int z=x;
        if(z>9){
        while(z){
        y = y*10 + z%10;
        z = z/10;
        }
        
        if(x==y)
            return true;
        else 
            return false;
        }
        else if(x>=0)
            return true;
            else 
                return false;
    }
};