class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Ideal Soltuion:

        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs)
        {
            int [] count = new int [26];  // count for each charcter a-z

            for (char c : s.toCharArray())
            {
                count[c - 'a']++; // subtraction to give the index valued, and increment it. 
                // count = count + 1;
            }
            String key = Arrays.toString(count); // convert count array to [0,0,0,0,0,] --> '0,0,0,0,0,0'
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);

        }
        return new ArrayList <>(res.values());

        
    }
}
