class Solution {

    // Brute Force Solution:

    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i =0; i < nums.length;i++)
        {
            for (int j = i +1; j< nums.length;j++)
            {
                int temp = nums[i] + nums[j];
                if (temp == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;



        
    }
    // check every pair of numbers in the array, and if valid then return that
    // use a double nested for loop: O(n^2)
}
