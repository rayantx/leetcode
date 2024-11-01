package PalindromeNumber;

public class Solution1 {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x <= 9) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int xReversed = 0;
        while (x > xReversed) {
            int rest = x % 10;
            x /= 10;

            xReversed = (xReversed * 10) + rest;
        }

        if (x == xReversed || x == xReversed / 10) {
            return true;
        } else {
            return false;
        }
    }
}
