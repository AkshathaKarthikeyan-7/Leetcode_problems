class Solution:
    def twoSum(self, nums, target):
        num_to_index = {}  # Dictionary to store number -> index mapping
        for index, num in enumerate(nums):
            complement = target - num
            if complement in num_to_index:
                return [num_to_index[complement], index]
            num_to_index[num] = index
