class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        yes = {}
        for i in range(len(nums)):
            if target - nums[i] in yes:
                return [yes[target - nums[i]],i]
            yes[nums[i]] = i


        