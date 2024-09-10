package binaryTree;

// Binary Search Tree always has the smallest value on the left of the root node 
// and larger one to the right of the root node
class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}

}

// Starting node of our tree called root
public class BinarySearchTree {
	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data) {
		if (root == null)
			root = new Node(data);
		else if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}

	// Inorder traverse left-root - right-> it will print in sorted order

	public void inorder() {
		inorderRec(root);
	}

	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}

	}

	// Pre-order Traverse # Root-Left-Right
	public void preorder() {
		preorderRec(root);
	}

	public void preorderRec(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}

	// PostOrder # Left-Right-Root
	public void postorder() {
		postorderRec(root);
	}

	public void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(3);
		tree.insert(9);
		tree.insert(15);
		tree.insert(5);
		tree.insert(11);
		System.out.println("=== In Order ====");
		tree.inorder();
		System.out.println("\n=== Pre Order ====");
		tree.preorder();
		System.out.println("\n=== Post Order ====");
		tree.postorder();

	}

}
