package com.madzia;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (char character : chars) {
            if (character == '{' || character == '(' || character == '[') {
                characterStack.push(character);
            } else if (character == '}' && !characterStack.empty() && characterStack.peek() == '{') {
                characterStack.pop();
            } else if (character == ')' && !characterStack.empty() && characterStack.peek() == '(') {
                characterStack.pop();
            } else if (character == ']' && !characterStack.empty() && characterStack.peek() == '[') {
                characterStack.pop();
            } else {
                return false;
            }
        }
        return characterStack.empty();
    }
}
