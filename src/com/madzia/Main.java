package com.madzia;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'a', 'B', 'c', 'd', 'E', 'f', '0'});
    }
}
