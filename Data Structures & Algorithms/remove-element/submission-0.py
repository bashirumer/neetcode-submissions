class Solution:
    # October 13, 2026:
    def removeElement(self, nums: List[int], val: int) -> int:
        x = 0;

        for i,n in enumerate(nums):
            if n != val:
                nums[x] = n
                x +=1
        return x


# pop by index not by value


        