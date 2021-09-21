package Leetcode;

public class StrongPasswordChecker {
    public static int strongPasswordChecker(String password) {
        if(password.length() < 6)
            return 6-password.length();

        int changeCounter = 0, tripletCounter = 0;

        boolean lowercasePresent, uppercasePresent, numberPresent;
        char[] input = password.toCharArray();
        char prevChar = input[1], prevPrevChar = input [0], currChar;

        lowercasePresent = Character.isLowerCase(prevChar) || Character.isLowerCase(prevPrevChar);
        uppercasePresent = Character.isUpperCase(prevPrevChar) || Character.isUpperCase(prevPrevChar);
        numberPresent    = Character.isDigit(prevChar) || Character.isDigit(prevPrevChar);

        for(int charIdx = 2; charIdx < input.length; charIdx++){
            currChar = input[charIdx];

            if(!lowercasePresent && Character.isLowerCase(currChar))
                lowercasePresent = true;

            if(!uppercasePresent && Character.isUpperCase(currChar))
                uppercasePresent = true;

            if(!numberPresent && Character.isDigit(currChar))
                numberPresent = true;

            if(charIdx >= 2){
                prevChar = input[charIdx-1];
                prevPrevChar = input[charIdx-2];
            }

            if(prevChar == prevPrevChar && prevChar == currChar && charIdx+3 < input.length) {
                changeCounter++;
                tripletCounter++;
                charIdx += 3;
            }
        }

        if(tripletCounter > 3){
            return tripletCounter;
        }

        if(!lowercasePresent)
            changeCounter++;

        if(!uppercasePresent)
            changeCounter++;

        if(!numberPresent)
            changeCounter++;


        return changeCounter;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("aaadef"));
    }
}
