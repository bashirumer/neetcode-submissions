class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        for i in range (len(strs[0])): # i (0,1,2,3,...) loops over the first String "bat"
            for s in strs: # picks the first word "bat"
                if i == len(s) or s[i] != strs[0][i]: 
                    return res
            res = res + strs[0][i]
        return res
#i = 0:
# does comparisoin 'b' (bat) != 'b' (bat)
# does comparisoin 'b' (bat) != 'b' (bag)
# does comparisoin 'b' (bat) != 'b' (bank)
# does comparisoin 'b' (bat) != 'b' (band)
# res = "" + b

# i = 1:
# does comparisoin 'a' (bat) != 'b' (bat)
# does comparisoin 'a' (bat) != 'a' (bag)
# does comparisoin 'a' (bat) != 'a' (bank)
# does comparisoin 'a' (bat) != 'a' (band)
# res = b + a

# i = 2:
# does comparisoin 't' (bat) != 'b' (bat)
# does comparisoin 't' (bat) != 'g' (bag)
#return res



        