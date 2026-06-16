package week2.day4;

public class ReverseWordsinaStringlII {

    public String reverseWords(String s) {
        s=s+" ";
        String curentstString = "";
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                curentstString = curentstString + s.charAt(i);

                for (int j = curentstString.length() - 1; j >=0; j--) {
                    reverse = reverse + curentstString.charAt(j);
                    // System.out.println(reverse);
                }
                curentstString =" ";
            }
            else {
                curentstString = curentstString+s.charAt(i)+" ";
            }
        }
        return reverse.trim();
    }

    public static void main(String[] args) {
        ReverseWordsinaStringlII ReverseWordsinaStringlII = new ReverseWordsinaStringlII();
        ReverseWordsinaStringlII.reverseWords("let's take Leetcode contest ");
        System.out.println(ReverseWordsinaStringlII.reverseWords("let's take Leetcode contest "));

    }
}
