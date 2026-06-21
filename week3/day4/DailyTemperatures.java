package week3.day4;

import java.util.Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int count = 0;
        int currentcount = 0;
        int[] arr = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i; j < temperatures.length; j++) {
                count++;
                
                if (temperatures[j]>temperatures[i]) {
                    currentcount = count;
                    arr[i]=currentcount-1;
                    break;
                }
            }
            count=0;
        }
        return arr;        
    }    
    public static void main(String[] args) {
        // 1. Create the temperature array
        int[] temperatures = {30,60,90};
        
        // 2. Create an object of your class
        DailyTemperatures obj = new DailyTemperatures();
        
        // 3. Call your method and store the result
        int[] result = obj.dailyTemperatures(temperatures);
        
        // 4. Print the result array
        System.out.println("Output: " + Arrays.toString(result));
    }
}
