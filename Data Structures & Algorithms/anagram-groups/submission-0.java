class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int count[] = new int[26]; // array of 26 characters, a-z

            // for loop to go through every single chacrter in each string one by one
            for (char c : s.toCharArray()) {
                // want to map 'a' to index 0, and z to index '25'
                // to get assci value of a character, conver that charcter to an int
                // a - a = 0, b-a = 1, c - a = 2, d - a, a is in '' as it's a literateal charcter and nto a string.
                count[c - 'a']++; // increment the count for the spefic word.
            }
            // once ocunt array is built out [2,3,4,0,0,0.....] for one spefic string such as "ate"
            // pass in the string ("ate"), and then an emptyy list []
            String key = Arrays.toString(count); // takes the count array an returns it as a string

            // res.putIfAbsent () will not add in values, where the cont already exsits in the hasmap.
            res.putIfAbsent(key, new ArrayList<>()); // puts the count array [2,3,4,0,0] into hasmap as the key, and empty list as the value

            res.get(key).add(s); // gets list [] store, and adds in s (which the string "ate") into that list

        }
        return new ArrayList<>(res.values()); // returns a list of all the values stored in the hashmap.  
    }
}
