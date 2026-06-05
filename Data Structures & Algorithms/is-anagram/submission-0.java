class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length () != t.length ()){
            return false;
        }

        char [] sSort = s.toCharArray(); // converts string to an array of chars
        char [] tSort = t.toCharArray();

        Arrays.sort(sSort); // sorts each alphabetcially (a,b,c,d ...)
        Arrays.sort(tSort);

        return Arrays.equals(sSort,tSort); // returns true if both strings are the same


    }
}
