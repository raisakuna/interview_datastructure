package LinkedList;

public class SingleLinkedList {
	private int size;
	Node head;
	// define the node class
	public class Node{
		String data;
		Node next;
		
		// constructor
		Node(String data) {
			this.data = data;
			this.next = null;
		}
		
	}
	// add- First
	public void add(String data) {
		Node newNode = new Node(data);
		// if the linked list is empty, make the new node the head
		if(head == null) {
			head  = newNode;
			return;
		}
		// the pointer of the new node will pointed to head and the new node will act as a head
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head= newNode;
			return;
		}
		Node currNode = head; // Assigning head as currNode
		while(currNode.next != null) {  // Traversing currNode until it reaches null
			currNode = currNode.next;
			}  
		currNode.next = newNode;   // making last node as currNode
		
	}
	
	public void deleteFirst() {
		if (head== null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		// if there is only one node
		if (head.next == null) {
			head = null;
			return;
		}
		// the first node is considered as a secondLast and second node as lastNode
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	// Printing 
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head; // Assigning head as currNode
		while(currNode != null) {  // Traversing currNode until it reaches null if we do currNode.next, the last node will not be printed
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
			}  
System.out.println("Null");		
	}

	public static void main(String[] args) {
SingleLinkedList list = new SingleLinkedList();
list.add("a");
list.add("is");
list.addLast("list");
list.add("This");

list.printList();
list.deleteFirst();
list.printList();

list.deleteLast();
list.printList();
	}

}
