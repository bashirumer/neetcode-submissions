class Solution:
    #October 12, 2-26:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} # empty hashmap Val:index
        for i,n in enumerate(nums):
            diff = target - n
            if diff in seen:
                return [seen[diff],i]
            seen[n] = i #seen[3] = 0, seen[4] = 1
            
        