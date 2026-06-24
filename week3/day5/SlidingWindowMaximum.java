package week3.day5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
   public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            
            dq.offerLast(i);
            
            if (i >= k - 1) {
                result[resultIndex] = nums[dq.peekFirst()];
                resultIndex++;
            }
        }
        
        return result;
    }    
    public static void main(String[] args) {
        SlidingWindowMaximum SlidingWindowMaximum = new SlidingWindowMaximum() ;
         int[] arr = {1,3,-1,-3,5,3,6,7};
         int k = 3;
        
        System.out.println(Arrays.toString(SlidingWindowMaximum.maxSlidingWindow(arr,k)));
    }
}
