/**
 * 20. Valid Parentheses
 * 
 * https://leetcode.com/problems/valid-parentheses/
 */
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push('.');
        for (char c : s.toCharArray()) {
            if (c == ')' && stack.pop() != '(')
                return false;
            if (c == ']' && stack.pop() != '[')
                return false;
            if (c == '}' && stack.pop() != '{')
                return false;
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
        }
        stack.pop();

        return stack.isEmpty();
    }
}