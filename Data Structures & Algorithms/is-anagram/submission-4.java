class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
    {
        return false; // not a vliad naagrma, as strings are different length

    }

    // creating 2 hasmaps for both string, which will sotre:
    // Every charcter: the frequency
    HashMap <Character, Integer> countS = new HashMap<>();
    HashMap <Character, Integer> countT = new HashMap<>();

    
    // . put(key, value)
    // key : is s.charAt
    // valeu: getordefualt which will return the current frequecny (vlaue) if oit exists in hashmap, 
    // if key not found, then it wwill return t0
    // Valufe: final what get or defulat returns we incremnt it by 1, so

    for (int i =0; i<s.length(); i++)
    {
        countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) +1);
        countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) +1);


    }
    
    return countS.equals(countT);

    }
}
