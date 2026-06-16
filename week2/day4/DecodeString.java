package week2.day4;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DecodeString {
    
public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        
        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
             
                currentNumber = currentNumber * 10 + (c - '0');
                
            } else if (c == '[') {
                countStack.push(currentNumber);
                stringStack.push(currentString);
                
                currentNumber = 0;
                currentString = new StringBuilder();
                
            } else if (c == ']') {
                StringBuilder previousString = stringStack.pop();
                int repeatTimes = countStack.pop();
                
                for (int i = 0; i < repeatTimes; i++) {
                    previousString.append(currentString);
                }
                
                currentString = previousString;
                
            } else {
                currentString.append(c);
            }
        }
        
        return currentString.toString();
    }





    public static void main(String[] args) {
        DecodeString dc = new DecodeString();
        dc.decodeString("3[a]2[bc]");
        System.out.println(dc.decodeString("3[a]2[bc]"));
    }
}
