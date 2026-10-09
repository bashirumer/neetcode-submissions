class Solution:
    #Ocotber 9, 2026:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # sets: no dupkciate, no oirdering, and no indexing. and easy lookups
        containsduplicate = set () # delcaring an empty set
        for x in nums:
            if x in containsduplicate:
                return True
            containsduplicate.add(x)
        return False
        