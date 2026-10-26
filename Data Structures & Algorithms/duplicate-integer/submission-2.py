class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        yes = set()
        for i in nums:
            if i in yes:
                return True
            yes.add(i)
        return False


        