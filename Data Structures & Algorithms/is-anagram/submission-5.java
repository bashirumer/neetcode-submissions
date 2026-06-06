class Solution {
    // HashMap Solution:
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
        {
            return false;
        }

        // hashmaps of bothStirngs:
        Map<Character, Integer> freqFirst = new HashMap();
        Map<Character, Integer> freqSecond = new HashMap();

        for (int i = 0; i < s.length();i++)
        {
            freqFirst.put(s.charAt(i), 1 + freqFirst.getOrDefault(s.charAt(i), 0));
            freqSecond.put(t.charAt(i), 1 + freqSecond.getOrDefault(t.charAt(i), 0));
        }
        
        System.out.println(freqFirst);
        System.out.println(freqSecond);

       return freqFirst.equals(freqSecond);

        




    }
}
