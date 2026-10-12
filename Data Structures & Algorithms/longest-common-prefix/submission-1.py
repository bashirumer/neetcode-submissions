class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        print(strs)
        res = ""
        for i in range (len(strs[0])): # i (0,1,2,3,...) loops over the first String "bat"
            for s in strs: # picks the first word "bat"
                if i == len(s) or s[i] != strs[0][i]: # does comparisoin 'b' !=
                    return res
            res = res + strs[0][i]
        return res
        