class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        d = {}
        for n in nums:
            d[n] = d.get(n,0)+1


        print(d)

        for key in d.keys():
            if d[key] > 1:
                return key
