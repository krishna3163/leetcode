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
/**
 * Definition for singly-linked list.
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify result list creation
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;

        // Loop until both lists and carry are processed
        while (l1 != null || l2 != null || carry != 0) {

            // Using ternary operator:
            // condition ? value_if_true : value_if_false
            // If l1 is not null → take l1.val, else use 0
            int x = (l1 != null) ? l1.val : 0;

            // If l2 is not null → take l2.val, else use 0
            int y = (l2 != null) ? l2.val : 0;

            // Calculate sum of values + carry
            int sum = carry + x + y;

            // Update carry for next digit
            carry = sum / 10;

            // Create a new node with the current digit
            ans.next = new ListNode(sum % 10);

            // Move result pointer forward
            ans = ans.next;

            // Move to next nodes in l1 and l2 if available
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        // Return the head of the new list (skip dummy node)
        return dummy.next;
    }
}
