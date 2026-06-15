package week2.day3;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        if (s.length() == 0) {
            return true;
        }
        while (j < s.length() && i<t.length()) {

            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        if (j==s.length()) {
            return true;
        }
        else return false;
        

    }

    public static void main(String[] args) {
        IsSubsequence IsSubsequence = new IsSubsequence();
        // IsSubsequence.isSubsequence("abc","ahbgdc");
        System.out.println(IsSubsequence.isSubsequence("abc", "ahgdc"));
    }
}
