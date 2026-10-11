class Solution:
    #october 11,2026:
    #brute Fporce Soltuion:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr = []
        for i in range (len(nums)): # start at index 0
            for j in range (i+1, len(nums)): # starat at index 1
                if (nums[i] + nums[j] == target):
                    return [i,j]

        