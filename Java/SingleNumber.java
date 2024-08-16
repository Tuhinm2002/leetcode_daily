class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int n:nums){
            int cnt = 0;
            if(map.containsKey(n)){
                cnt = map.get(n);
            }
            map.put(n,cnt+1);
        }

        for (int n2 : nums){
            if(map.get(n2) == 1){
                ans = n2;
                break; 
            }
        }

        return ans;
    }
}
