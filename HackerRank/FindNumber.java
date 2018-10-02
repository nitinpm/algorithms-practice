package HackerRank;

import java.util.List;

public class FindNumber {
    static String findNumber(List<Integer> arr, int k){
        for (int item : arr) {
            if(k == item)
                return "YES";
        }

        return "NO";
    }
}
