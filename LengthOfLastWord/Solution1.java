package LengthOfLastWord;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        int count = 0;

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = s.length()-1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) !=' ') {
            count++;
            i--;
        }
        return count;
    }
}
