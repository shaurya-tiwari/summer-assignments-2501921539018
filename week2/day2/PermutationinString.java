package week2.day2;

import java.util.Arrays;

public class PermutationinString {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1count = new int[26];
        int[] count = new int[26];

        int countsize = s1.length();

        for (int i = 0; i < countsize; i++) {
            s1count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']++;
        }

        for (int i = 0; i < s2.length()-countsize; i++) {
            if (Arrays.equals(s1count, count)) {
                return true;
            }
            char newchar = s2.charAt(i+countsize);
            count[newchar - 'a']++; 
            char oldchar =s2.charAt(i);
            count[oldchar - 'a']--;
        }





        return Arrays.equals(s1count,count);

    }

    public static void main(String[] args) {
        PermutationinString ps = new PermutationinString();
        System.out.println(ps.checkInclusion("ab", "eidbaooo"));
    }
}