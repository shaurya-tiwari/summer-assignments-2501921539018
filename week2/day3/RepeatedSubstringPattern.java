package week2.day3;

public class RepeatedSubstringPattern {
        public boolean repeatedSubstringPattern(String s) {

            String doubles = s+s;
            String newstring = doubles.substring(1, doubles.length()-1);
            if (newstring.contains(s)) {
                return true;   
            }else{
                return false;
            }
    }




    public static void main(String[] args) {
        RepeatedSubstringPattern RepeatedSubstringPattern = new RepeatedSubstringPattern();
        RepeatedSubstringPattern.repeatedSubstringPattern("abcbcabc");
        System.out.println(RepeatedSubstringPattern.repeatedSubstringPattern("abcbcabc"));
    }
}
