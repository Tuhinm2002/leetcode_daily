class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n:nums){
            int cnt = 0;
            if(map.containsKey(n)){
                cnt = map.get(n);
            }
            map.put(n,cnt+1);
        }

        int i = 0;
        for(int n:nums){
            if(map.get(n) == 1){
                ans[i] = n;
                i+=1;
            }
        }

        return ans;
    }
}
