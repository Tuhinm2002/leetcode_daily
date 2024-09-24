# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertVal(self,node,val):
        if(node == None):
            node = TreeNode(val)
            return node

        if(val < node.val):
            node.left = self.insertVal(node.left,val)

        if (val > node.val):
            node.right = self.insertVal(node.right,val)

        return node

    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        
        node = TreeNode()
        for i in range(len(preorder)):
            node = self.insertVal(node,preorder[i])
        
        return node.right
