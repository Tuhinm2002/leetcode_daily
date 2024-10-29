class Solution {
    public int minimizedStringLength(String s) {
        char[] str = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0;i<str.length;i++){
            set.add(str[i]);
        }

        return set.size();
    }
}
