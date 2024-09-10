package binaryTree;

class NodeDelete {
	int data;
	NodeDelete left;
	NodeDelete right;

	public NodeDelete(int data) {
		this.data = data;
		this.left = null;
		this.right = null;

	}
}

public class DeleteLeaf {
	NodeDelete root;

	// insertion or creating
	public void insert(int data) {
		root = insertRec(root, data);
	}

	public NodeDelete insertRec(NodeDelete root, int data) {
		if (root == null)
			root = new NodeDelete(data);
		else if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}
	
	// traversing -inorder- LEFT-ROOT-Right

	public void traverse() {
		traverseRec(root);
	}

	public void traverseRec(NodeDelete root) {
		if (root != null) {
			traverseRec(root.left);
			System.out.println(root.data + " ");
			traverseRec(root.right);
		}

	}
	
	// delete leaf
	public void deleteLeaf(int data) {
		root = deleteLeafRec(root, data);
	}
	public NodeDelete deleteLeafRec(NodeDelete root, int data) {
		// Base Case: If the tree or subtree is empty, return null
		if(root == null) {
			return null;
		}
		// Recursive cases: Traverse the tree to find the node to delete
		if (data< root.data) {
			root.left = deleteLeafRec(root.left, data);
			}
		else if(data > root.data) {
			root.right = deleteLeafRec(root.right, data);
		} else {
			// case 1: Node is a leaf
			if (root.left == null && root.right == null) {
				return null; // Return null to remove the leaf node
			}
			//case2 : If the node has only one child, return that child
			if(root.left == null) {
				return root.right;
			} else if(root.right== null){
				return root.left;
			}
			// case3: Node has two children
			// Find the minu=imum value in the right subtree
			root.data =findMinValue(root.right);
			
			// Delete the node with the minimum value in the right subtree
			root.right = deleteLeafRec(root.right, root.data);
		}
		return root;

	}
	
	private int findMinValue(NodeDelete root) {
		int minValue = root.data;
		while(root.left != null) {
			minValue = root.left.data;
			root = root.left;
		}
		return minValue;
	}
	
	

	public static void main(String[] args) {
		DeleteLeaf tree = new DeleteLeaf();
		tree.insert(6);
		tree.insert(3);
		tree.insert(5);
		tree.insert(9);
		tree.insert(16);
		tree.insert(2);

		tree.traverse();
		System.out.println("Tree after deletion");
		tree.deleteLeaf(6);
		tree.traverse();
		
	}

}
