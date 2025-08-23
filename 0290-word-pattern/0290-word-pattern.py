class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words=s.split()
        if len(words)!=len(pattern):
            return False
        
        patttoword={}
        wordtopatt={}
        for char,wd in zip(pattern,words):
            if char in patttoword and patttoword[char]!=wd:
                return False
            if wd in wordtopatt and wordtopatt[wd]!=char:
                return False
            patttoword[char]=wd
            wordtopatt[wd]=char
        return True         