class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        
        cnt = 0
        for i in range(len(num)-1,-1,-1):
            if num[i] == '0':
                cnt+=1

            elif num[i] != '0':
                break
        print(cnt)
        if cnt == 0:
            return num
        return num[:-cnt]
