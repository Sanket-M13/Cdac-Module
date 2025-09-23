class TreeDemo{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	TreeDemo(){
		root = null;
	}
	
	TreeDemo(int d){
		root = new Node(d);
	}
	
	void inorder(Node n){
		if(n == null)
			return;
		inorder(n.left);
		System.out.print(n.data+ " ");
		inorder(n.right);
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data+ " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	void postorder(Node n){
		if(n == null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+ " ");
	}
	
	public static void main(String args[]){
		TreeDemo t1 = new TreeDemo();
		t1.root = new Node(20);
		
		t1.root.left = new Node(25);
		t1.root.right = new Node(56);
		
		t1.root.left.left = new Node(15);
		t1.root.left.right = new Node(31);
		
		System.out.print("Inorder");
		t1.inorder(t1.root);
		System.out.println();
		
		System.out.print("PreOrder");
		t1.preorder(t1.root);
		System.out.println();
		
		System.out.print("PostOrder");
		t1.postorder(t1.root);
		
		
	}
}