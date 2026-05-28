class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        long rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        if (originalNumber != rev || originalNumber < 0) {
            return false;
        }
        return true;
    }
}