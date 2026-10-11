class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} # empty hashmap Val: Index
        for i, n in enumerate(nums):
            diff = target - n
            if diff in seen: # IF the value eixst int he hashamps
                return [seen[diff],i] # return the index of first value (diff) and current index
            seen[n] = i # adds the value: index pariing to the hashmap.


        