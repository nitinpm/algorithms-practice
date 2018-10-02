import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WinningLotterySolution {

    static long winningLotteryTicket(String[] tickets) {

        String[] regex = {"\\d*0+\\d*","\\d*1+\\d*","\\d*2+\\d*","\\d*3+\\d*"
                ,"\\d*4+\\d*","\\d*5+\\d*","\\d*6+\\d*","\\d*7+\\d*","\\d*8+\\d*","\\d*9+\\d*"};

        int cLen = 0;
        for(int c=0;c < tickets.length; c++)
            cLen = cLen + c;


        long winningPairs = 0;
        int noPairFlag;
        String[] concat = new String[cLen];
        String[] selectedTickets = new String[tickets.length];
        int k=0;
        int dontInclude;
        for(int z = 0; z < tickets.length; z++){
            String temp = tickets[z];
            dontInclude = 0;
            for(int x=0;x<regex.length;x++)
                if(!temp.matches(regex[x])) {
                    dontInclude = 1;
                    break;
                }

            if(dontInclude == 1)
                selectedTickets[k++] = tickets[z];
        }

        int w = 0;

        for(int s = k; s < tickets.length; s++){
            winningPairs = winningPairs + s;
        }

        for(int i = 0;i < k-1; i++){
            for(int j = i+1; j < k; j++){
                concat[w++] = selectedTickets[i] + selectedTickets[j];
            }
        }


        for(int d = 0; d < w; d++){
            String winningCombo = concat[d];
            noPairFlag = 0;

            for(int q = 0; q < regex.length; q++){
                if(!winningCombo.matches(regex[q])) {
                    noPairFlag = 1;
                    break;
                }
            }


            if(noPairFlag == 0){
                winningPairs++;
            }

        }


        return winningPairs;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        long result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}