package binaryTree;

class NodeBST {
	int data;
	NodeBST left;
	NodeBST right;

	public NodeBST(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

// class 
public class SearchValueInBST {
	NodeBST root;

	// inserting data into the tree
	public void insert(int data) {
		root = insertRec(root, data);
	}

	public NodeBST insertRec(NodeBST root, int data) {
		if (root == null) {
			return new NodeBST(data);
		}
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	// Traversing ... inroder # LEFT-ROOT-RIGHT
	public void inorder() {
		inorderRec(root);
	}

	public void inorderRec(NodeBST root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}

	}

	// Searching a value tree
	public boolean search(int value) {
		return searchRec(root, value);
	}

	private boolean searchRec(NodeBST root, int value) {
		if (root == null) {
			return false;
		}
		if (root.data == value) {
			return true;
		}
		if (value < root.data) {
			return searchRec(root.left, value);
		} else {
			return searchRec(root.right, value);
		}
	}

	public static void main(String[] args) {
		SearchValueInBST nodeBST = new SearchValueInBST();
		nodeBST.insert(6);
		nodeBST.insert(3);
		nodeBST.insert(5);
		nodeBST.insert(9);
		nodeBST.insert(16);
		nodeBST.insert(2);

		nodeBST.inorder();
		System.out.println("=====");

		System.out.println("\n" + nodeBST.search(8));
	}
}