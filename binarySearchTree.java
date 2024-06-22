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
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        Node cur=root;
        int temp=Integer.MAX_VALUE;
        while(cur.getLeftChild()!=null){
            temp=cur.getData();
            cur=cur.getLeftChild();
        }
        return temp;
    }
    public void addNode(int data) {
        Node cur = root;

        while (cur != null) {

        }

    }
}
