// kadane algorithm currentSum =\max(nums[i],currentSum+nums[i]);
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int cursum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cursum = Math.max(nums[i], cursum + nums[i]);  //main logic for check subs 
            
                sum = Math.max(sum, cursum);
            }
            
            
        return sum;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] arr = { 5,4,-1,7,8 };
        System.out.println(ms.maxSubArray(arr));
    }
}