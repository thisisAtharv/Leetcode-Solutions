class Solution {
    public int findGCD(int[] nums) {
        int mn = nums[0];
        int mx = nums[0];
        for (int ditto : nums) {
            if (ditto < mn) {
                mn = ditto;
            } else if (ditto > mx) {
                mx = ditto;
            }
        }
        int res = Math.min(mx, mn);
        while (mn > 0) {
            if (mx % res == 0 && mn % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
}