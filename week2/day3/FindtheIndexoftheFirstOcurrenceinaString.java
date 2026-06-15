package week2.day3;

public class FindtheIndexoftheFirstOcurrenceinaString {
    
    public int strStr(String haystack, String needle) {
        
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            // find till sie of needle 
            String window = haystack.substring(i,i+needle.length());
            if (window.equals(needle)) {
                return i ;
            }
        }



         return -1;
    }




    public static void main(String[] args) {
        FindtheIndexoftheFirstOcurrenceinaString FindtheIndexoftheFirstOcurrenceinaString = new FindtheIndexoftheFirstOcurrenceinaString();
       int result =  FindtheIndexoftheFirstOcurrenceinaString.strStr("sadbutsad", "sad");
        System.out.println(result);
    }
}


        // int[] haycount = new int[26];
        // int[] needlecount = new int[26];

        // for (int i = 0; i < needle.length(); i++) {
        //     // curent letters 
        //     int storehaystack = haystack.charAt(i);
        //     int storeneedle = needle.charAt(i);
        //     // store in arrat and move ++ 
        //     haycount[storehaystack]++;
        //     needlecount[storeneedle]++;
        // }

        // for (int i = 0; i < haycount.length; i++) {

        // }