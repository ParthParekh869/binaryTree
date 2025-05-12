public class Main{
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree();
        bst.addNode(1);
        bst.addNode(2);
        System.out.println(bst.findMin());
    }
}