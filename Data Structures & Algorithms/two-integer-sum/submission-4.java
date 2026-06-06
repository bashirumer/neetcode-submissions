class Solution {

    // HashMap Solution:
    public int[] twoSum(int[] nums, int target) {

        // Hashmap<Integer, Integer> stores value and index for each valuelse

        Map<Integer, Integer> map = new HashMap();

        for (int i =0; i< nums.length;i++)
        {
            // look for the differnce:
            int diff = target - nums[i];
            
            // if map contains the diff:
            if(map.containsKey(diff))
            {
                // then return the index where the diff is at, 
                // i is the current index, diff +i = target
                return new int[] {map.get(diff),i};
            }

            map.put(nums[i],i); // otherwise add the pair into the hashmap
           
        }

        return new int[] {}; //return an empty array
        
    }
}

// look for the difference and see if it exits in array
