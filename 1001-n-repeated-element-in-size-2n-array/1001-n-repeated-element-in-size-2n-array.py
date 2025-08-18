from collections import Counter


class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        res = Counter(nums)
        for k, v in res.items():
            if v > 1:
                return k
