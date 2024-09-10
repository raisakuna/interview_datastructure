package LinkedList;

public class AddTwoLinkedList {

	    // Define the ListNode class
	    private static class ListNode {
	        int val;
	        ListNode next;

	        public ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(0);
	        ListNode curr = dummy;
	        int carry = 0;

	        // Traverse both linked lists until both are empty
	        while (l1 != null || l2 != null) {
	            int x = (l1 != null) ? l1.val : 0;
	            int y = (l2 != null) ? l2.val : 0;
	            int sum = carry + x + y;

	            carry = sum / 10;
	            curr.next = new ListNode(sum % 10);
	            curr = curr.next;

	            if (l1 != null) l1 = l1.next;
	            if (l2 != null) l2 = l2.next;
	        }

	        // If there's still a carry, add it as a new node to the end of the result
	        if (carry > 0) {
	            curr.next = new ListNode(carry);
	        }

	        return dummy.next;
	    }

	    // Helper method to print the contents of a linked list
	    public void printList(ListNode head) {
	        ListNode curr = head;
	        while (curr != null) {
	            System.out.print(curr.val + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	       AddTwoLinkedList list = new AddTwoLinkedList();

	        // Create the first linked list
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(2);
	        l1.next.next = new ListNode(4);
	        l1.next.next.next = new ListNode(3);

	        // Create the second linked list
	        ListNode l2 = new ListNode(5);
	        l2.next = new ListNode(4);
	        l2.next.next = new ListNode(6);

	        // Add the two linked lists and print the result
	        ListNode result = list.addTwoNumbers(l1, l2);
	        list.printList(result); // Expected output: 6 6 0 4
	    }
	
}
