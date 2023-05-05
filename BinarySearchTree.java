
public class BinarySearchTree {

	public Node root;
	public int values;
	private static BinarySearchTree bt;
	
	public static void main(String[] args)
	{
		System.out.println("Binary Tree Example");
		
		createBinaryTree();
		
		System.out.print(getValue());
		
	}
	
	public void add(int value)
	{
		//this starts the recursion from the root node
		root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current, int value)
	{
		//if the current node is null
		if(current == null) // this shows that the tree is at the 'leaf'
		{
			return new Node(value);
		}
		
		//if the new nodes value is less that the current nodes value, we go to the left child
		if (value < current.value)
		{
			current.left = addRecursive(current.left, value);
		}
		//if the new nodes value is greater than the current nodes value, we go to the right child
		else if (value > current.value)
		{
			current.right = addRecursive(current.right, value);
		}
		else
		{
			return current; // value already exists
		}
		
		return current;
	}
	
	private static BinarySearchTree createBinaryTree() {
		bt = new BinarySearchTree();
		
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    
	    
		return bt;
	}
	
	public static int getValue()
	{
		//gets root Value
		return bt.root.value;
	}
	
}

class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value)
	{
		this.value = value;
		right = null;
		left = null;
	}
}


