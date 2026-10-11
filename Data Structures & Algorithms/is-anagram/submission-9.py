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
            #countS["r"] = Value
            countT[t[i]] = 1 + countT.get(t[i],0);
        return countS == countT

# First Note on String:
# String are similar ot array, so Ss ="abc"
#s[0] = "a", s[1] = "b",
# Notation s[i] is refferinto to that index of string 's'

# Second Note on Hashamps:
#m = {}
#m["a"] = 5     # 'a' doesn't exist yet, so it's added: {'a': 5}

# Third Note on Equals:

#== on two dicts returns True only if both have exactly the same keys, and each key maps to the same value. Order doesn’t matter.