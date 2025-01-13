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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummy; // Pointer to build the result list
        int carry = 0; // Variable to store the carry-over during addition

        // Iterate through both lists until both are null and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values of the current nodes; if null, use 0
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry (integer division)

            // Create a new node with the digit value of sum and attach it to the result list
            current.next = new ListNode(sum % 10);

            // Move the current pointer forward
            current = current.next;

            // Move to the next nodes in the input lists if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Return the result list (skipping the dummy node)
    }
}
