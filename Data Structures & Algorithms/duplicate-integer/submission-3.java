class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Use hashset as space complexity to make hahset in worst case will be
        // O(n)

        // hasent also cannot sotre duplicates, 

        HashSet <Integer> duplicate = new HashSet <>(); // creating the hashset

        for (int n : nums)
        {
            if (duplicate.contains(n))
            {
                return true;
            } // return true and exit if hahset contains value

            duplicate.add(n);


        }

        return false; // exit for loop (meaning all numbers added into hashset were unique)




        
    }
}