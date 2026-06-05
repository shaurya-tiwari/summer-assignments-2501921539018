package week1.day1;


public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        int count = 1;// not 0 becaouse the 1st element always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {

                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray RemoveDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println(RemoveDuplicatesfromSortedArray.removeDuplicates(arr));
    }
}