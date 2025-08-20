class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        fp, sp = [], []
        nums1=set(nums1)
        nums2=set(nums2)
        for i in nums1:
            if i not in nums2:
                fp.append(i)
        for i in nums2:
            if i not in nums1:
                sp.append(i)
        return [fp,sp]