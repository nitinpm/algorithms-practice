package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    static List<Integer> oddNumbers(int l, int r){
        List<Integer> result = new ArrayList<>();

        for(int i = l; i<=r; i++){
            if(i%2 == 1)
                result.add(i);
        }


        return result;
    }
}
