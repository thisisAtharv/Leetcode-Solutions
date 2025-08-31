class Solution:
    def firstUniqChar(self, s: str) -> int:
        order=[]
        count={}
        index={}
        for i,x in enumerate(s):
            if x in count:
                count[x]+=1
            else:
                count[x]=1
                order.append(x)
                index[x]=i
        for x in s:
            if count[x]==1:
                return index[x]
        return -1