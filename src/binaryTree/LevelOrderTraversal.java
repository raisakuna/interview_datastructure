package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}
	
	
}
public class LevelOrderTraversal {
	
	//Method to perform level order traversal
	public void levelOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		// Create queue  for level-order traversal, this is an Interface
		Queue<Node> queue =  new LinkedList<>();
		
		//start with the root node
		queue.add(root);
		
		//Traverse until the queue is empty
		while(!queue.isEmpty()) {
			//remove the front node from the queue
			Node currentNode =queue.poll();
			//Print the data of the current node
			System.out.print(currentNode.data + " ");
			
			// Add the left child to the queue if it exists
			if(currentNode.left != null) {
				queue.add(currentNode.left);
			}
			
			// Add the right child to the queue if it exists
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
	}

	public static void main(String[] args) {
		 // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        LevelOrderTraversal tree = new LevelOrderTraversal();
        
        System.out.println("Level Order Traversal:");
        tree.levelOrderTraversal(root);  // Output should be 1 2 3 4 5 6 7
	}

}
