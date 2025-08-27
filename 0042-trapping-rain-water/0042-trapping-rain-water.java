class Solution {
    public int trap(int[] height) {
        int n = height.length, i = 0, j = n-1, leftmost = 0, rightmost = 0, water = 0;
         while(i<j){
            if(height[i]<height[j]){
                if(height[i]>=leftmost){
                    leftmost=height[i];
                }
                else{
                    water+=leftmost-height[i];
                }
                i+=1;
            }
            else{
                if(height[j]>=rightmost){
                    rightmost=height[j];
                }
                else{
                    water+=rightmost-height[j];
                }
                j-=1;
            }
         }
         return water;
    }
}