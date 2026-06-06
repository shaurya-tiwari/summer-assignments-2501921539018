package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int[] newnum = new int[nums.length];

        for (int i = nums.length-1; i >=0; i--) {
            int leftsqr = nums[left]*nums[left];
            int rightsqr = nums[right]*nums[right];

            if (leftsqr>rightsqr) {
                newnum[i] = leftsqr;

                left++; // move forwrd 
            }
            else {
                newnum[ i] = rightsqr;
                right --; // move back 
            }
        }
        return newnum;

    }

    public static void main(String[] args) {
        SquareOfSortedArray SquareOfSortedArray = new SquareOfSortedArray();
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(SquareOfSortedArray.sortedSquares(arr)));    }
}
