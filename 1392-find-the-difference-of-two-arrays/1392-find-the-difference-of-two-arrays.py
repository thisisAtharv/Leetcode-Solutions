class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        fp=[]
        sp=[]
        for i in nums1:
            if i not in nums2 and i not in fp:
                fp.append(i)
        for i in nums2:
            if i not in nums1 and i not in sp:
                sp.append(i)
        res=[fp,sp]
        return res