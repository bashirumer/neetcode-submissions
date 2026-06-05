class Solution {
public boolean hasDuplicate(int[] nums) {
    // intializng a hasshet
    HashSet<Integer> set = new HashSet<>();

    // for loop to go through array of integers
    for (int i = 0; i< nums.length; i++)
    {
        if (set.contains (nums[i]))
        {
            return true; // reutrn true and exist if number already exists in hashset
        }
        else // add that number ot the set.
        {
            set.add(nums[i]);
        }
    }
    return false; // means no duplcate found, as it went thorugh the for loop without finding anythign. 

}

}