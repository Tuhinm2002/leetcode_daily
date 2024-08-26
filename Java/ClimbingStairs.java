class Solution {
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(Arrays.toString(arr));

        return arr[n-1] + arr[n-2];
    }
}
