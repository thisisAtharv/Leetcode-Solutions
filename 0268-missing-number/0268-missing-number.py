class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        thatnum=0
        for i in range(n):
            if i not in nums:
                thatnum=i
                return thatnum
        if thatnum==0:
            return n