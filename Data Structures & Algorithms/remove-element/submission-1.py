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
# n =3: 3!= 3 --> false --> [3,2,2,3]
# n = 2: 2!=3 --> true --> nums[0] = 2 --> [2,2,2,3]
# n = 2: 2!=3 --> true --> nums[1] = 2 -->[2,2,2,3]
# n =3: 3!= 3 --> false --> [2,2,2,3]

# porgram only at the first k leemtns of the List
# when the value in the array doenst match --> wnat to remove int
# so in this case we overwirte it
        