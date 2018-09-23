import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<String, Integer> romToIntMap = new HashMap<String, Integer>(){{
            put("I", 1); put("V", 5);  put("X", 10); put("L", 50); put("C", 100); put("D", 500); put("M", 1000);
        }};

        int integerValue = 0;
        String[] romanSplit = s.split("");

        int length = romanSplit.length;
        String prev = romanSplit[0], curr;
        
        for(int i = 0; i < length; i++){
            curr = romanSplit[i];


            if(!prev.equals(curr)){
                //all the minus conditions
                String prevAndCurr = prev + curr;
                switch(prevAndCurr) {
                    case "IV": integerValue += 3; break;
                    case "IX": integerValue += 8; break;
                    case "XL": integerValue += 30; break;
                    case "XC": integerValue += 80; break;
                    case "CD": integerValue += 300; break;
                    case "CM": integerValue += 800; break;
                    default: integerValue += romToIntMap.get(curr);
                }

            }

            else{
                integerValue += romToIntMap.get(curr);
            }

            prev = curr;
        }

        return integerValue;
    }
}
