class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        #Hashmap Key : Value
        # 1a, 1c, 1t : {act, cat}

        for s in strs: # Going through each String (act)
            count = [0] * 26 # a ..z 26 charcters
            for c in s: # goting through each charcter ('a','c','t')
                count[ord(c) - ord("a")] +=1
                #[1,0,0,0,0,....]
            res[tuple(count)].append(s)
        return list(res.values())
        