package week3.day4;

import java.util.Arrays;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {
        // Stack<Integer> stack = new Stack<>();
        int count = 1;
        int result = 0;
        int max = 0;

        int[] newrr = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            newrr[i] = heights[i] * 1;
            for (int j = i + 1; j < heights.length; j++) {
                count++;
                int length = heights[i];
                int width = count;
                if (heights[i] <= heights[j]) {
                    result = length * width;
                    newrr[i] = result;
                    // stack.push(result);
                }
                else {
                    break; // Stop looking further to the right. 
                }
                count = 1;
            }
            max = Arrays.stream(newrr).max().getAsInt();

        }
        return max;
    }

    public static void main(String[] args) {
        LargestRectangleinHistogram LargestRectangleinHistogram = new LargestRectangleinHistogram();
        int[] arr = { 2,0,2 };
        LargestRectangleinHistogram.largestRectangleArea(arr);
        System.out.println(LargestRectangleinHistogram.largestRectangleArea(arr));
    }
}
