class Solution {
    public String longestCommonPrefix(String[] strs) {
        // emopty imdeitly retyrn empty stirng, or less than 2 numbersealed
        String str = "";


        if (strs.length < 1)
            return str;
        
        //. Brute force Soltuion: Iterate thotugh the arary one elemnt at a time
        // stop when charcter don not match anymoore
        // prefix cant be longer than shorter elemtn in string

        String prefix = strs[0];

        for (int i = 0; i < strs[0].length();i++) // iterating through the Strings veritalclcy
        {
            for (String s : strs)
            {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i))
                {
                    return s.substring(0,i);
                }

            }
            

        }
        return strs[0]; // completes entire loop meaning, that the first string matched entirely. 
        
    }
}