package week1.day5;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            // wap.
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseString ReverseString = new ReverseString();
        char[] word = { 'h', 'e', 'l', 'l', 'o' };

        ReverseString.reverseString(word);
        System.out.println();
    }

}
