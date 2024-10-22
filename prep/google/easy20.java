class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty() || stack.peek()!=ch) {
                    return false;
                }
                stack.pop();
            } else {
                if(ch=='(') stack.push(')');
                if(ch=='[') stack.push(']');
                if(ch=='{') stack.push('}');
            }
        }

        return stack.isEmpty();
    }
}
