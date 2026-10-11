#OCtober 11, 2026
class Solution:
    # Optimal Soltuion is using Hashamps: (Key, Value)
    def isAnagram(self, s: str, t: str) -> bool:
        countS, countT = {}, {} # delcaring 2 empty hasshmaps fo rboth fo the string
        if (len(s) != len(t)):
            return False

        #s[i] --> chcrater or key fo hahsamps
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i],0);
            countT[t[i]] = 1 + countT.get(t[i],0);
        return countS == countT
            
        
        