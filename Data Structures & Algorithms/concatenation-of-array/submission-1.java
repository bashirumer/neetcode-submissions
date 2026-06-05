class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2 * (nums.length);
        int ans[] = new int[length];
        int idx = 0;

        // can run this however many times. 

        for (int i =0; i < 2; i++) // loop will run 2 time. 
        {
            for ( int num : nums) // iterathrough the array
            {
                ans[idx] = num; // at index 0,1,2,3 will assign it nums
                idx++; 

            }
        }


        return ans;
    }
}

// ans will always be twice the length of nums[]
// later half of ans from [i+n] -- [length] is a complete diplicate.

// keep orginal arraty and add that array to itslef, and return that