class Solution:
    def generateSubsets(self,nums,ans,subs,i):
        if(i >= len(nums)):
            ans.append(subs.copy())
            return
        
        subs.append(nums[i])
        self.generateSubsets(nums,ans,subs,i+1)

        subs.pop()
        self.generateSubsets(nums,ans,subs,i+1)


    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        subs = []
        self.generateSubsets(nums,ans,subs,0)
        return ans

    
