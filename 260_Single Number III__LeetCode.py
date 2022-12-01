class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        h_map={}
        res=[]
        for i in nums:
            if i in h_map:
                h_map[i]=1+h_map[i]
            else:
                h_map[i] = 1
        for i in h_map:
            if h_map[i] == 1:
                res.append(i)
        return(res)
                