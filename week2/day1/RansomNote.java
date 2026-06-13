package week2.day1;

public class RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] count = new int[256];
            // count charforeach
            for (char words : magazine.toCharArray()) {
                count[words]++;
            }

            //cpunt for ranome 
            for (int i : ransomNote.toCharArray()) {
                if (count[i]==0) {
                    return false;
                }
                count[i]--;
            }
         
        return true;
    }


    public static void main(String[] args) {
        RansomNote RansomNote = new RansomNote();
        String ransomNote= "aa";
        String magazine= "aab";
        RansomNote.canConstruct(ransomNote,magazine);
        System.out.println(RansomNote.canConstruct(ransomNote,magazine));
    }
}
