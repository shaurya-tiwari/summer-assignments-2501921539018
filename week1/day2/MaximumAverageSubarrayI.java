//sliding windows =currentSum =currentSum+nums[i]-nums[i-k];

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double currentsum = 0;
        double maxtavsum = 0;

        for (int i = k; i < nums.length; i++) {
            currentsum = currentsum +nums[i]-nums[i-k];
            maxtavsum= Math.max(maxtavsum, currentsum);
            }

        return maxtavsum/k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI ms1 = new MaximumAverageSubarrayI();
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(ms1.findMaxAverage(arr, 4));
    }

}