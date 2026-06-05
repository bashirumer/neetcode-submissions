class Solution {
    public boolean isAnagram(String s, String t) {
            // imedialty return false, if strings arenot of the same length
    if (s.length() != t.length()) {
        return false;
    }
    // creating the two hasmaps:

    HashMap<Character, Integer> countS = new HashMap<>();
    HashMap<Character, Integer> countT = new HashMap<>();

    // both strings are of same length which is confirmed
    // iterthrogh one of them, then retirve the first chartcer in the string which is KEY
    // for the value in the string which is the frequncy in the character
    // we want to incremtne the coutn to 1 after encourting it
    // .get() returns avlue of something if ti exists.
    //.gteOr Default () returns value of key if it exists
        // 0 if key is first
        // otherwise add +1 to increase the counter.
    // +1 TO INCRMENET THE frequqcy.

    for (int i = 0; i < s.length(); i++) {
        countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0) + 1);
        countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0) + 1);

    }

    return countS.equals(countT); // easy of w=chekcing if both hasmaps are equal and have same key -value pairs

    // manual way of doing this:
   //  boolean same = countS.size() == countT.size() && countS.entrySet() == countT.entrySet();
    // manaul way of chekcing the if to hasmaps are the same


    }
}
