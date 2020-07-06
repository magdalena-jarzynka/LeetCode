package com.madzia;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : chars) {
            if (Character.isLetter(character) || Character.isDigit(character)) {
                stringBuilder.append(character);
            }
        }
        String s1 = stringBuilder.toString();
        String reverse = stringBuilder.reverse().toString();
        return reverse.equals(s1);
    }
}
