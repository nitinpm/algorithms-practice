package Misc;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexZipFiles {
    public static void main(String args[]) {
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        List<String> result = new ArrayList<>();

        Matcher m = Pattern.compile("[a-zA-Z0-9_]+.zip").matcher(input);

        while(m.find()){
            result.add(m.group());
        }

        for(String r: result) {
            System.out.print(r + " ");
        }

    }
}
