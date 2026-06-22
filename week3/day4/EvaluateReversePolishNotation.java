package week3.day4;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
            for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+"->{
                    int right = Integer.parseInt(stack.pop());
                    int left = Integer.parseInt(stack.pop());
                    int ans = right + left;
                    stack.push(String.valueOf(ans));}
                case "-"->{
                    int rightminus = Integer.parseInt(stack.pop());
                    int leftminus = Integer.parseInt(stack.pop());

                    int ansminus = leftminus-rightminus;
                    stack.push(String.valueOf(ansminus));
                }

                    
                case "*"->{
                    int rightmul = Integer.parseInt(stack.pop());
                    int leftmul = Integer.parseInt(stack.pop());
                    int ansmul = rightmul * leftmul;
                    stack.push(String.valueOf(ansmul));

            }
                case "/"->{
                    int rightdiv = Integer.parseInt(stack.pop());
                    int leftdiv = Integer.parseInt(stack.pop());
                    int ansdiv = leftdiv / rightdiv;
                    stack.push(String.valueOf(ansdiv));
                }
                    
            
                default->{
                    stack.push(tokens[i]);
                }
            }
        
        }

            return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation EvaluateReversePolishNotation = new EvaluateReversePolishNotation();
        String[] arr = {"2","1","+","3","*"};
        
        System.out.println(EvaluateReversePolishNotation.evalRPN(arr));
    }
}
