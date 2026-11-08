class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = ""
        for i in s:
            if i.isalnum():
                new += i.lower()
        
        for i in range(len(new)):
            if new[-i -1] != new[i]:
                return False
        return True
