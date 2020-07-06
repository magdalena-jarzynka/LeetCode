package com.madzia;

public class ReverseString {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temporary = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temporary;
        }
        System.out.println(s);
    }
}
