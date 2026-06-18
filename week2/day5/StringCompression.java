package week2.day5;

public class StringCompression {
    public int compress(char[] chars) {
        int count = 1;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                chars[index] = chars[i];
                index++;
                if (count > 1) {
                    String countstring = String.valueOf(count);
                    for (int j = 0; j < countstring.length(); j++) {
                        chars[index] = countstring.charAt(j);
                        index++;
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        StringCompression StringCompression = new StringCompression();
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        StringCompression.compress(chars);
        System.out.println(StringCompression.compress(chars));
    }
}
