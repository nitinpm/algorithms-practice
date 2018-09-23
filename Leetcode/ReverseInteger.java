public class ReverseInteger {

    public int reverse(int x) {
        long y = 0;
        while(x!=0){
            y = y*10 + x%10;
            x = x/10;
        }

        if ((y < -2147483648) || (y > 2147483647))
            return 0;
        else
            return (int) y;
    }
}
