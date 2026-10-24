class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        cha = {}
        cha2 = {}
        for i in s:
            cha[i] = cha.get(i, 0) + 1

        for i in t:
            cha2[i] = cha2.get(i,0) + 1

        if cha == cha2:
            return True
        return False
        

            