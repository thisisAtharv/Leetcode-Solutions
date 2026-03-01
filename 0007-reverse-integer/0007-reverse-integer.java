class Solution {
    public int reverse(int x) {
        long rev = 0;
        boolean isNegative = x < 0;

        x = Math.abs(x);
        for (int i = x; i > 0; i = i / 10) {
            int digit = i % 10;
            rev = rev * 10 + digit;
        }
        if (isNegative) {
            rev = -rev;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ){
            rev = 0;
        }
        return (int)rev;
    }
}