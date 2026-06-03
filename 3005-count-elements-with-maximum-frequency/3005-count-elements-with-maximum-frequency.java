class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freqarr = new int[101];
        int maxVal = 0;
        int total = 0;
        for (int num : nums) {
            freqarr[num]++;
            int currentVal = freqarr[num];
            if (currentVal > maxVal) {
                maxVal = currentVal;
                total = maxVal;
            } else if (currentVal == maxVal) {
                total += currentVal;
            }
        }
        return total;
    }
}