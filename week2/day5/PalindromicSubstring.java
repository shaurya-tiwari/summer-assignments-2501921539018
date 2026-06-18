package week2.day5;

public class PalindromicSubstring {
    public String longestPalindrome(String s) {
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                    current = current+s.charAt(j);
                if (s.charAt(j)==s.charAt(i) && longest.contains(current)) {
                    longest = current;
                 }
            }
            System.out.println(longest);
        }
        return "";
    }
    public static void main(String[] args) {
        PalindromicSubstring PalindromicSubstring = new PalindromicSubstring();
        PalindromicSubstring.longestPalindrome("babad");
    }
}
