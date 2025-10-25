class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution04 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;  
        ListNode current = head;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }

            if (prev.next == current) {
                prev = prev.next;
            } else {
                prev.next = current.next;
            }

            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                         new ListNode(2,
                         new ListNode(3,
                         new ListNode(3,
                         new ListNode(4,
                         new ListNode(4,
                         new ListNode(5)))))));

        System.out.print("Original list: ");
        printList(head);

        ListNode result = deleteDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(result);
    }
}
