package Leetcode.amzTop50;

public class RobotBoundedInCircle {
    public static boolean isBounded(String instructions){
        int dir=0;
        int x=0, y=0;

        for(char item: instructions.toCharArray()){
            switch(item){
                case 'L': dir = (dir + 3) % 4; break;
                case 'R': dir = (dir + 1) % 4; break;
                case 'G': {
                    switch (dir){
                        case 0: y++; break;
                        case 1: x++; break;
                        case 2: y--; break;
                        case 3: x--; break;
                    }
                } break;
            }
        }

        return (x==0 && y==0) || dir != 0;
    }

    public static void main(String[] args) {
        System.out.println(isBounded("GG"));
    }
}
