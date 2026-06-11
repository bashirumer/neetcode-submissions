class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Brute Force Soltution:
        // sort each string and then group them using a hasHashMap
        // Time Complexity:  O(nlogn) plus ieraign through them is O(m) --> O(m * nlogn)
        
        // Hashamap: sorted String, list of Strings

        Map <String, List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length;i++)
        {
            char [] charArray = strs[i].toCharArray();
            Arrays.sort(charArray); // sort the array
            System.out.println(charArray); // prints it out
            String sorted = new String(charArray);
            res.putIfAbsent(sorted, new ArrayList<>()); 
            res.get(sorted).add(strs[i]); // gets empty array list, and adds the String  to it. 
        }
        return new ArrayList<>(res.values());






        
    }
}
