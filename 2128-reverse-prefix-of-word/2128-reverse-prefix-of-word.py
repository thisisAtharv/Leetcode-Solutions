class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        for i,index in zip(word, range(len(word))):
            if i==ch:
                rev=word[:index+1]
                lastpt=word[index+1:]
                firstpt=rev[::-1]
                return firstpt+lastpt
        return word