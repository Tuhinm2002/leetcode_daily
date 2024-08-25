class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1;
        while (i <= n){
            if(n%i == 0){
            System.out.println(i);
            ans.add(i);
            }
            i+=1;
        }

        if(k > ans.size())
        return -1;
        else
        return ans.get(k-1);
    }
}
