class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        int maxVal = Integer.MIN_VALUE;
        int total = 0;
        for(int key: hm.keySet()){
            int currentVal = hm.get(key);
            if(currentVal>maxVal){
                maxVal = currentVal;
                total = maxVal;
            }
            else if(currentVal==maxVal){
                total+=currentVal;
            }
        }
        return total;
    }
}