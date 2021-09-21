package Misc.EPI.primitivetypes;

public class ParityCheck {
    public static short parityBrute(long x){
        short result = 0;

        while(x != 0){
            System.out.println("x: " + x);
            System.out.println("x&1: " + (x&1)); //bitwise-AND to mask and get LSB value
            System.out.println("currResult: " + result);
            result ^= (x&1);

            System.out.println("result after XOR (result ^ (x&1)): " + result);
            System.out.println("--------------------------------");
            x = x>>>1;
        }

        return result;
    }

    public static short parityShift(long x){
        //page 45 EPI
        //x ^= x >>> 32; //for 64 bit words
        //x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;

        return (short)(x & 1);
    }

    public static void main(String[] args) {
        //System.out.println("parity of word = " + parityBrute(10));

        //System.out.println(parityShift(255));

        System.out.println(4 & 3);
    }
}
