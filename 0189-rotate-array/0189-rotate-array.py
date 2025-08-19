class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        k=k%n  #That means rotating by 12 is the same as rotating by 2. (12%5=2)
        firstpart=nums[-k:] #-1 -2 -3 inclusive
        secondpart=nums[:-k]    #-1 -2 -3 leaving them, exlusive
        nums[:]=firstpart+secondpart