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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tmp_head = head;
        ArrayList<Integer> tmp_arr = new ArrayList<>();
        while(tmp_head != null){
            tmp_arr.add(tmp_head.val);
            tmp_head = tmp_head.next;
        }

        for(int i=0;i<=tmp_arr.size()-k;i+=k){
            int left = i;
            int right = i + k - 1;

            while(left < right){
                int tmp_val = tmp_arr.get(left);
                tmp_arr.set(left,tmp_arr.get(right));
                tmp_arr.set(right,tmp_val);
                left+=1;
                right -= 1;
            }
        }

        ListNode list_node = new ListNode();
        ListNode last_node = list_node;

        int i = 0;
        while (i < tmp_arr.size()){
            ListNode tmp_node = new ListNode(tmp_arr.get(i));
            last_node.next = tmp_node;
            last_node = tmp_node;
            i+=1;
        }

        return list_node.next;

    }
}
