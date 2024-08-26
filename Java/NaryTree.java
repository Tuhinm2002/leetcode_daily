/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();

        List<Integer> arr = new ArrayList<>();

        dfs(root,arr);

        return arr;
    }

    private void dfs(Node root,List<Integer> arr){
        for(Node n: root.children){
            dfs(n,arr);
        }

        arr.add(root.val);
    }
}
