# October 9, 2026:
class Solution:
    # Anagarmas by defult need to be fo the same length String. 
    # brute force Soltuion: Sort both array array O(n log n) x2
    # then do the comaprison
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
        sortedS = sorted(s)
        sortedT = sorted(t)

        if (sortedS == sortedT):
            return True

        print ("S:   " , sortedS)
        print ("T:   " , sortedT)
        
        return False


        