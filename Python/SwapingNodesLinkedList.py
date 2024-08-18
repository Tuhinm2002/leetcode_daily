# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:

        tmp_head = head
        tmp_arr = []
        while tmp_head != None:
            tmp_arr.append(tmp_head.val)
            tmp_head = tmp_head.next

        tmp_val = tmp_arr[k-1]
        tmp_arr[k-1] = tmp_arr[-k]
        tmp_arr[-k] = tmp_val

        list_node = head
        last_node = list_node
        i = 0
        while i < len(tmp_arr):
            tmp_node = ListNode(tmp_arr[i])
            last_node.next = tmp_node
            last_node = tmp_node
            i+=1

        return list_node.next

        
