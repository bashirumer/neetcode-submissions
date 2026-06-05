class Solution {
    public int[] twoSum(int[] nums, int target) {

HashMap <Integer, Integer> match = new HashMap<>();
        for (int i = 0; i< nums.length; i++)
        {
            int num = nums[i]; // value to store in hashamp if it doesnt exist
            int diff = target - num;

            if (match.containsKey(diff))
            {
                // match.get (diff) returns the first index of in the map
                return new int[] {match.get(diff),i};
            }

            match.put(num,i);
        }
        return new int[0];
        
    }
}
