# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        
        def insertVal(root,val):
            if root == None:
                return TreeNode(val)
            
            if root.val > val:
                # It is coming out fully changed 
                # after it is passed into the function
                root.left = insertVal(root.left,val)

            if root.val < val:
                root.right = insertVal(root.right,val)

            return root

        root = insertVal(root,val)
        return root
