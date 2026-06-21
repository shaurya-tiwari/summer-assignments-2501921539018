package week3.day3;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int currentNumber : nums2) {
            while (!stack.isEmpty() && currentNumber > stack.peek()) {
                map.put(stack.pop(), currentNumber);
            }
            stack.push(currentNumber);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}