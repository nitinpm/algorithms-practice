/**
Given a 32-bit signed integer, reverse digits of an integer.

Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
public:
    int reverse(int x) {
        long y = 0;
        while(x){
            y = y*10 + x%10;
            x = x/10;
        }
        
        if(y>INT_MAX || y<INT_MIN)
            return 0;
        else 
            return y;
    }
};