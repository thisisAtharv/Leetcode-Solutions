class Solution:
    def repeatedCharacter(self, s: str) -> str:
        count={}
        for x in s:
            if x in count:
                count[x]+=1
            else:
                count[x]=1
            if count[x]==2:
                return x