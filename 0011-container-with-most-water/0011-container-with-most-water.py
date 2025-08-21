class Solution:
    def maxArea(self, height: List[int]) -> int:
        i=0
        j=len(height)-1
        res=[]
        while i<j:
            ht=min(height[i],height[j])
            res.append(ht * (j - i))
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        return max(res)