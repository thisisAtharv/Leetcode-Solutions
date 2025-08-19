class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        k%=n
        fp=nums[-k:]
        sp=nums[:-k]
        nums[:]=fp+sp
        return nums