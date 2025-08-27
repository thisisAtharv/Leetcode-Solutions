class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            int end = nums[i];
            if(start==end){
                res.add(String.valueOf(start));
            }
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(start).append("->").append(end);
                res.add(sb.toString());
            }
        }
        return res;
    }
}