package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

         public List<Integer> findAnagrams(String s, String p) {

            ArrayList<Integer> list = new ArrayList<>();
            
            if (s.length()<p.length()) {
                return list;
            }

            //count words 
            int scount[] = new int[26];
            int pcount[] = new int[26];

            // fil value in array 

            for (int i = 0; i < p.length(); i++) {
                int sindex = s.charAt(i)-'a';
                int pindex = p.charAt(i)-'a';
                scount[sindex]++;
                pcount[pindex]++;

            }

            if (Arrays.equals(scount,pcount)) {
                list.add(0);
            }

            for (int i = 1; i <= p.length()-s.length(); i++) {
                int prev = s.charAt(i-1)-'a';
                int next = s.charAt(i+s.length()-1)-'a';
                scount[prev]--;
                scount[next]++;

                if (Arrays.equals(scount,pcount)) {
                    list.add(i);
                }

            }


            return list;
    }

    
    public static void main(String[] args) {
        
    }
}
