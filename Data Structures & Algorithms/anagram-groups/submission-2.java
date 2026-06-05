class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap <String, List<String>> resutl = new HashMap<> ();
    // mapping charCount to list of anagrams

    for (String s: strs) // forr loop to got through entire array: strs = ["act","pots","tops","cat","stop","hat"]
    {
        int [] count = new int[26]; // intial array of 26 zeros, from a-z

        // for loop to go through one string: act, converitng it first into an array of charcters
        for  (char c: s.toCharArray()) // array it loops through now is ['a', 'c', 't']
        {
            count[c - 'a'] = count[c - 'a'] + 1;

            // a = 80 --> 80 -80
            // b = 81 --> 81-80

            // ex: if the act pateern will be [1,0,1,0,0,0,0,.....]

            // a --> count [0] = 0 +1 =1
            // c --> count [2] = 0 + 1 = 21

            // similar shit will happen for the letter 't'

        }
        String Key = Arrays.toString(count); // convert the array "1,0,1,0,0,0,..." to strings.
        resutl.putIfAbsent(Key,new ArrayList<> ()); // if the this pattern doesnt already exist, then  add a empty array list for it.
        resutl.get(Key).add(s); 
        
        // .get the value store at that pattenr
        // the value which in this case if the list is empty
        // then we add the string (s) to the list,
    }
    return new ArrayList<>(resutl.values());

}

}
