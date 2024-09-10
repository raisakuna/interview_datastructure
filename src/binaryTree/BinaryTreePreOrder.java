package binaryTree;

public class BinaryTreePreOrder {
	static class Node {
		int data;
		Node left;
		Node right;

		// Constructor
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

// By starting idx at -1, the code ensures that the first call to buildTree operates on the first element 
//	of the nodes array (index 0). If idx were initialized to 0, the first call would skip the first element 
//	and start with the second element of the array. Initializing it to -1 is a common practice when using array indices,
//	where the first element has an index of 0.
	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) { // is checking if nodes[0] == null
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;

		}
	}

	public static void preOrder(Node root) {
		if (root == null) {
			System.out.print(-1 + " ");
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null) {
			System.out.print(-1 + " ");
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		// preOrder(root);
		inorder(root);

		System.out.println();
		System.out.println(+root.data);

	}

}
