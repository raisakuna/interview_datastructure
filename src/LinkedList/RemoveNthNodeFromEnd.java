package LinkedList;

public class RemoveNthNodeFromEnd {
	private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if (head.next == null){
            return null;
        }

        // counting size
        int size =0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int indexToSearch = size -n;
        ListNode prev = head;
        int i = 1;
        curr = head;
        while( i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
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
    	RemoveNthNodeFromEnd solution = new RemoveNthNodeFromEnd();

        // Create an example linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Remove the 2nd node from the end of the list and print the result
        ListNode result = solution.removeNthFromEnd(head, 2);
        solution.printList(result); // Expected output: 1 2 3 5
    }

}
