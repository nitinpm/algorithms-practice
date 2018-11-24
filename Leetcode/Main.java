package Leetcode;

public class Main {
    public static void main(String[] args){

        //Roman to Integer test cases:
        /*RomanToInteger r2i = new RomanToInteger();
        System.out.println(r2i.romanToInt("III"));
        System.out.println(r2i.romanToInt("IV"));
        System.out.println(r2i.romanToInt("IX"));
        System.out.println(r2i.romanToInt("LVIII"));
        System.out.println(r2i.romanToInt("MCMXCIV"));*/


        //Two Sum test cases:
        //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.
        /*TwoSum twoSumObject = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result;
        result = twoSumObject.twoSum(nums, 9);
        result = twoSumObject.twoSumOptimum(nums, 9);
        System.out.println(result[0] + " " + result[1]); */


        //Reverse and integer test case:
        //Given a 32-bit signed integer, reverse digits of an integer.
        //Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
        //For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
        /*ReverseInteger reverse = new ReverseInteger();
        System.out.println(reverse.reverse(-873453453));*/


        //Palindrome number:
        //Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
        //Coud you solve it without converting the integer to a string?
        /*Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindrome(1331));
        System.out.println(pal.isPalindrome(1332));*/

        //Longest common prefix:
        //To find the longest common prefix string amongst an array of strings.
        //If there is no common prefix, return an empty string "".
        //Input is in lowercase.
        /*String[] input1 = {"flower","flow","flight"};
        String[] input2 = {"dog","racecar","car"};
        String[] input3 = {};
        String[] input4 = {"abcd"};
        String[] input5 = {"c", "c"};
        LCPrefix lcp = new LCPrefix();
        System.out.println("\"" + lcp.longestCommonPrefix(input1) + "\"");
        System.out.println("\"" + lcp.longestCommonPrefix(input2) + "\"");
        System.out.println("\"" + lcp.longestCommonPrefix(input3) + "\"");
        System.out.println("\"" + lcp.longestCommonPrefix(input4) + "\"");
        System.out.println("\"" + lcp.longestCommonPrefix(input5) + "\"");*/

        // Test t1 = new Test();


        //Subsequence
        /*Subsequence s = new Subsequence();
        String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
        System.out.println(s.findSubsequence("abppplee", D));*/


        /*StringSplosion s = new StringSplosion();
        System.out.println(s.stringSplosion("ab"));*/

        /*SpanOfArray s = new SpanOfArray();
        int[] input = {1,4,2,1,4,4,4};
        System.out.println(s.maxSpan(input));*/

        //NEED REWORK
        /*ValidParentheses parentheses = new ValidParentheses();
        String test = "(){}[]([])";
        System.out.println(parentheses.isValid(test));*/

        /*HeapSort hp = new HeapSort();
        int[] input = {10,2,15,3,19,1,29,31,13};
        hp.sort(input);
        hp.printArray(input);*/


        /*WithoutString ws = new WithoutString();
        System.out.println(ws.withoutString("Hello there", "E"));*/


        /**
         * PivotIndex: Given an array of integers nums, write a method that returns the "pivot" index of this array.
         We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
         If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
         */
        /*FindPivot fp = new FindPivot();
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(fp.pivotIndex(nums));*/

        /**
         * Twice as big:In a given integer array nums, there is always exactly one largest element.
         Find whether the largest element in the array is at least twice as much as every other number in the array.
         If it is, return the index of the largest element, otherwise return -1.
         */
        /*TwiceAsBig twiceAsBig = new TwiceAsBig();
        int[] nums = {0,0,2,3};
        System.out.println(twiceAsBig.dominantIndex(nums));*/


        /**
         * Given a pattern and a string str, find if str follows the same pattern.
         Here follow means a full match, such that there is a bijection between a letter in pattern
         and a non-empty word in str.
         */
        /*WordPattern wp = new WordPattern();
        String pattern = "", str = "beef";
        System.out.println(wp.wordPattern(pattern, str));*/


        /**
         * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
         * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
         * You may assume the integer does not contain any leading zero, except the number 0 itself.
         */
        /*PlusOne po = new PlusOne();
        int[] inp = {1,2,3,9};
        po.printArray(po.plusOne(inp));*/


    }

}
