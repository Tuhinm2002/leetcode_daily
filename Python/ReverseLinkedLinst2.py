# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:

        tmp_head = head
        tmp_arr = []
        while (tmp_head !=None):
            tmp_arr.append(tmp_head.val)
            tmp_head = tmp_head.next

        new_arr = tmp_arr[left-1:right]

        new_arr = tmp_arr[:left-1] + new_arr[::-1] + tmp_arr[right:]

        list_node = head
        last_node = list_node
        i = 0
        while i < len(new_arr):
            tmp_node = ListNode(new_arr[i])
            last_node.next = tmp_node
            last_node = tmp_node
            i+=1

        return list_node.next
