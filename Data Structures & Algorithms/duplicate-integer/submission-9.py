# October 8, 2026: Optimal Solution
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashset = set() # ermpty hashet with name 'hashset'

        for n in nums: # for loop over array
            if n in hashset: # if value exists in hashset
                return True # return true
            hashset.add(n) # toehr wise add it to has set
        return False # falsm mean no duplicate

        