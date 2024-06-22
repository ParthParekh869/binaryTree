public class binarySearchTree {
    private Node root;
    public boolean search(int data){
        boolean found = false;
        Node cur=root;
        while (!found || cur != null){
            if (cur.getData() == data){
                found=true;
            }
            else if (cur.getData() > data){
                cur=cur.getLeftChild();
            }
            else{
                cur=cur.getRightChild();
            }
        }
        return found;
    }
    public int findMin(){
        int temp=Integer.MIN_VALUE;
        if(root == null) {
            return temp;
        }
        Node cur=root;
        while(cur.getLeftChild()!=null){
            temp=cur.getData();
            cur=cur.getLeftChild();
        }
        return temp;
    }
    public void addNode(int data) {
        // if root is null then initialise the root with the new node
        if (root==null){
            root = new Node(data);
        }
        // bst has at least one node
        else{
            Node prev=root;
            Node cur = root;
            boolean spotFound=false;
            boolean insertToLeft=true;
            while (!spotFound) {
                // if there is no left child node then add node as a left child node
                if (cur.getData() > data){
                    prev=cur;
                    cur=cur.getLeftChild();
                }
                else {
                    prev=cur;
                    cur=cur.getRightChild();
                    insertToLeft=false;
                }
                if (cur==null){
                    spotFound=true;
                }
            }
            Node newNode = new Node(data);
            if(insertToLeft){
                prev.setLeftChild(newNode);
            }
            else {
                prev.setRightChild(newNode);
            }

        }


    }
}
