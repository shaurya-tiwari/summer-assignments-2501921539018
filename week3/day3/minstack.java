package week3.day3;

import java.util.Stack;

class MinStack {

    // Do stacks declare kiye
     Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        // Constructor mein dono stacks ko initialize kiya
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        // Asli value hamesha mainStack mein jayegi
        mainStack.push(value);
        
        // minStack mein humesha us waqt ka sabse chota number push karenge
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            // Agar naya number chota hai toh wo jayega, nahi toh purana chota number hi repeat hoga
            minStack.push(Math.min(value, minStack.peek()));
        }
    }
    
    public void pop() {
        // Jab pop karenge, toh dono stacks se ek-ek dabba udh jayega
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        // Sabse upar wali value mainStack se milegi
        return mainStack.peek();
    }
    
    public int getMin() {
        // Sabse choti value minStack ke top par rakhi hai
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
