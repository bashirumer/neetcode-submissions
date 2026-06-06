class Solution {

    // HashMap Solution:
    public int[] twoSum(int[] nums, int target) {

        // Hashmap<Integer, Integer> stores value and index for each valuelse

        Map<Integer, Integer> map = new HashMap();

        for (int i =0; i< nums.length;i++)
        {
            int diff = target - nums[i];

            if(map.containsKey(diff))
            {
                return new int[] {map.get(diff),i};
            }

            map.put(nums[i],i);
           
        }

        return new int[] {};
        
    }
}

// look for the difference and see if it exits in array
