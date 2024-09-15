class Solution {
    public int findTheLongestSubstring(String s) {
        int[] mapy = new int[32];
        Arrays.fill(mapy,-2);
        mapy[0] = -1;

        int maxLen = 0;
        int mask = 0;

        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            switch(str[i]){
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
            }
            int prev = mapy[mask];
            if(prev == -2){
                mapy[mask] = i;
            }
            else{
                maxLen = Math.max(maxLen,i-prev);
            }
        }

        return maxLen;
    }
}
