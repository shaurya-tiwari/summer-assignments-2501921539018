package week1.day3;

// by using two pointers . 
public class containerwithmostwater {
    public int maxArea(int[] height) {
        int left = 0;
        ;
        int right = height.length - 1;
        int maxarea = 0;
        while (left < right) {
            int width = right - left;
            int curentarea = width * Math.min(height[left], height[right]);
            maxarea = Math.max(maxarea, curentarea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;

            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        containerwithmostwater cn = new containerwithmostwater();
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(cn.maxArea(arr));

    }
}
