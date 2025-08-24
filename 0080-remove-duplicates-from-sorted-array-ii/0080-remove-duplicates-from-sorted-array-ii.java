class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            int count = freq.getOrDefault(nums[i],0);
            if(count<2){
                freq.put(nums[i],count+1);
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}