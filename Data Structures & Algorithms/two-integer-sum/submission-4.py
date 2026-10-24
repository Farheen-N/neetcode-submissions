class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        bers = set()
        for i in range(len(nums)):
            if target - nums[i] in bers:
                return [nums.index(target - nums[i]), i]
            bers.add(nums[i])
