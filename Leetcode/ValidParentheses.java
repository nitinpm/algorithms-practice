import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s){
        String[] split = s.split("");
        Stack<String> braces = new Stack<>();


        for(int i = 0; i < split.length; i++){
            if(split[i].equals("{") || split[i].equals("[") || split[i].equals("("))
                braces.push(split[i]);

            if(split[i].equals("}") && braces.peek().equals("{"))
                braces.pop();

            if(split[i].equals("]") && braces.peek().equals("["))
                braces.pop();

            if(split[i].equals("(") && braces.peek().equals("("))
                braces.pop();
        }

        return braces.isEmpty();
    }
}
