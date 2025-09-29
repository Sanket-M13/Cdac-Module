class BinarySearchTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data =d;
            left = right = null;
        }
    }
    Node root;

    BinarySearchTree(){
        root = null;
    }

    void inorder(Node n){
        if(n==null)
            return;
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);
    }
    void insert(int key){
        root = insertdata(root, key);
    }
    Node insertdata(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key<root.data){
            root.left = insertdata(root.left,key);
        }else if(key>root.data){
            root.right = insertdata(root.right,key);
        }
        return root;
    }

    void delete(int key){
        root = deletedata(root,key);
    }

    Node deletedata(Node root, int key){
        if(root == null)
            return root;
        
        if(key<root.data){
            root.left = deletedata(root.left,key);
        }else if(key>root.data){
            root.right = deletedata(root.right, key);
        }else{
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            root.data = minvalue(root.right);
            root.right = deletedata(root.right,root.data);
        }
        return root;
    }
    int minvalue(Node n){
        int x = root.data;
        while(root.left != null ){
            x = root.left.data;
            root = root.left;
        }
        return x;
    }

    public static void main(String args[]){
        BinarySearchTree bs = new BinarySearchTree();
        bs.insert(45);
        bs.insert(46);
        bs.insert(47);
        bs.insert(44);
        bs.insert(42);
        bs.insert(50);
        bs.insert(41);

        bs.inorder(bs.root);
        bs.delete(44);
        System.out.println();
        bs.inorder(bs.root);


    }
    
}