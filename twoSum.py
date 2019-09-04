class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        buffer_dict = {}

        for i in range(len(nums)):
            if nums[i] in buffer_dict:
                return [buffer_dict[nums[i]], i]
            else:
                buffer_dict[target - nums[i]] = i





