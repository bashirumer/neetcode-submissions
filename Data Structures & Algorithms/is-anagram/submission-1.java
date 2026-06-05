class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length () != t.length ()){
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap <> ();

        HashMap<Character, Integer> countT = new HashMap <> ();

        for (int i =0; i< s.length ();i++)
        {
            countS.put(s.charAt(i), 
            countS.getOrDefault(s.charAt(i), 0) + 1);

            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i), 0) + 1);

        }

        return countS.equals(countT);

        // char [] sSort = s.toCharArray(); // converts string to an array of chars
        // char [] tSort = t.toCharArray();

        // Arrays.sort(sSort); // sorts each alphabetcially (a,b,c,d ...)
        // Arrays.sort(tSort);

        // return Arrays.equals(sSort,tSort); // returns true if both strings are the same


    }
}
