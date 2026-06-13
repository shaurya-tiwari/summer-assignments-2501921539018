package week2.day1;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[] count = new int[256];
        for ( char elem : s.toCharArray()) {
            count[elem]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char currentchar = s.charAt(i);
            if (count[currentchar]==1) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterinaString FirstUniqueCharacterinaString = new FirstUniqueCharacterinaString();
        String s = "leetcode";
        System.out.println(FirstUniqueCharacterinaString.firstUniqChar(s)); 
    }
}       
