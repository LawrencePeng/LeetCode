public class Solution {
    public int evalRPN(String[] tokens) {
        return evl(tokens);
    }
    int evl(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String it : tokens) {
            if(!"+-*/".contains(it))
                stack.push(Integer.valueOf(it));
            else {
                int a = stack.pop();
                int b = stack.pop();
                switch(it) {
                    case "+": stack.push(a + b);
                        break;
                    case "-": stack.push(b - a);
                        break;
                    case "*": stack.push(a * b);
                        break;
                    case "/": stack.push(b / a);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
