class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        H_map = {}
        
        for string in strs :
            sortString= ''.join(sorted(string))
            
            if sortString in H_map:
                H_map[sortString].append(string)
            else:
                H_map[sortString]=[string]
                
        return list(H_map.values())