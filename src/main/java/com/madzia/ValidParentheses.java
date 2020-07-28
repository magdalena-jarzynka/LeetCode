package com.madzia;

import java.util.Stack;

public class ValidParentheses {
    private Stack<Character> characterStack = new Stack<>();

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        for (char character : chars) {
            if (isOpeningBracket(character)) {
                characterStack.push(character);
            } else if (isBracketsMatch(character)) {
                characterStack.pop();
            } else {
                return false;
            }
        }
        return characterStack.empty();
    }

    private boolean isBracketsMatch(char character, char opening, char closing) {
        return character == closing && characterStack.peek() == opening;
    }

    private boolean isBracketsMatch(char character) {
        return !characterStack.empty()
                && (isBracketsMatch(character, '{', '}')
                || isBracketsMatch(character, '(', ')')
                || isBracketsMatch(character, '[', ']'));
    }

    private boolean isOpeningBracket (char character) {
        return character == '{' || character == '(' || character == '[';
    }
}
