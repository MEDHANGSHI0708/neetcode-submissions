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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            arr.add(curr);
            curr = curr.next;
        }

        int index = arr.size() - n;

        if (index == 0) {
            return head.next;
        }

        ListNode prev = arr.get(index - 1);
        prev.next = (index == arr.size() - 1) ? null : arr.get(index + 1);

        return head;
    }
}