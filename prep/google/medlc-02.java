class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0) {
            int n1 = l1!=null ? l1.val : 0;
            int n2 = l2!=null ? l2.val : 0;

            int n = n1 + n2 + carry;
            carry = n/10;
            n = n % 10;

            ListNode newNode = new ListNode(n);
            curr.next = newNode;
            curr = newNode;

            l1 = l1!=null ? l1.next : l1;
            l2 = l2!=null ? l2.next : l2;
        }

        return head.next;
    }
}
