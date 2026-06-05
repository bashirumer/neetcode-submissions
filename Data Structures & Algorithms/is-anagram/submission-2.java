class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) // both string aren't of same size
        {
            return false; // not an anagram
        }

        // Create two hastables to store <key, value> pair
        // store each string character as the key, and the frequency as the value.
        Hashtable <Character, Integer> firstSet = new Hashtable<>();
        Hashtable <Character, Integer> secondSet = new Hashtable<>();

        for (int i = 0; i< s.length(); i++)
        {
            // .put (key, value)
            // key is the character that we inptu,
            // .getordefualt (key, default avlue) --> returns value (frequency) of chacrter
                // gets current cout of string, if it doesnt exiset then returns 0
            // +1 increase the count fo the chracter becuase you just saw it
            firstSet.put(s.charAt(i),firstSet.getOrDefault(s.charAt(i), 0) + 1);
            secondSet.put(t.charAt(i),secondSet.getOrDefault(t.charAt(i), 0) + 1);
        }

        return firstSet.equals(secondSet);

    }
}
