class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        int n = nums.length;
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1;i<nums.length;i++){
            int val = nums[i];
            dp[i+1] = Math.max(dp[i],dp[i-1]+val);
        }

        System.out.println(Arrays.toString(dp));

        return dp[nums.length];
    }
}
