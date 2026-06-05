class Solution {
    public boolean hasDuplicate(int[] nums) {
         // build Haset to Sotre integer Values. intially empty
        Set <Integer> numbers = new HashSet<>();

        for (int n: nums) // iterate throught the set
        {
            if (numbers.contains(n))  // if values exist in hashset
            {
                return true; // return true and exit
            }
            numbers.add(n); // otherwise add that number in
        }
        return false; // no duplcates found after going though hasset.
 
    }
}
