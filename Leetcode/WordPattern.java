import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        String[] patternChars = pattern.split("");
        String[] words = str.split(" ");

        int patLen = patternChars.length;
        int strLen = words.length;

        if(patLen != strLen)
            return false;

        HashMap<String, String> map = new HashMap<>();
        String key, value;

        for(int i = 0; i < patLen; i++){
            key = patternChars[i];
            if(!key.matches("[a-zA-Z0-9]"))
                return false;
            value = words[i];
             if(!map.containsKey(key)){
                 if(!map.containsValue(value))
                     map.put(key, value);
                 else
                     return false;
             }

             else{
                 if(!map.get(key).equals(value))
                     return false;
             }

        }

        return true;
    }
}
