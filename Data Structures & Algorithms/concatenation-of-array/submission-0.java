class Solution {
    // Solution 2 with only one pass:
    public int[] getConcatenation(int[] nums) {

        int length = nums.length;
        int [] ans = new int [2* length];

        for (int i = 0; i < length; i++)
        {
            ans[i] = nums[i]; // will work for index 0,1,2
            ans[i + length] =  nums[i]; // for index 3,4,5
            // asingin 2 index at the same time. 

        }
        return ans;
        
    }
}