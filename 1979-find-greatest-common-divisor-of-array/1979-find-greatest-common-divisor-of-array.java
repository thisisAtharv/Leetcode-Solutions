class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int n: nums){
            max = Math.max(n,max);
            min = Math.min(n,min);
        }

        while (max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}