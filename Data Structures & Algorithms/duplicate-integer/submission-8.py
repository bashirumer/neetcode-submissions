# October 8, 2026: Brute Force Soltuion
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # for i in range(len(nums)): # go throught the outerloop
        #     for j in range(i+1, len(nums)): #starat form i+1 and stop at the last elemtnb
        #         if nums[i] == nums[j]:
        #             return True
        # return False


        # Soprting Soltuion:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                return True
        return False

        