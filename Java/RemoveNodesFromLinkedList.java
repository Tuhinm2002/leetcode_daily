/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode tmp_head = head;
        ListNode list_node = new ListNode();
        ListNode last_node = list_node;
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }
        while(tmp_head != null){
            if(s.contains(tmp_head.val) != true){
                ListNode tmp_node = new ListNode(tmp_head.val);
                last_node.next = tmp_node;
                last_node = tmp_node;
            }
            tmp_head = tmp_head.next;
        }


        return list_node.next;
    }
}
