package week2.day2;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] words = new boolean[128];
        int left = 0;
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {

            char currentword = s.charAt(i);

            while (words[currentword]) {
                words[s.charAt(left)] = false;
                left++;
            }

            words[currentword] = true;
            maxlen = Math.max(maxlen, i - left + 1);

        }

        return maxlen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters LongestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}
