package BinaryTree;

public class Tester
{
    public static void main(String[] args) {
        BinaryTree tr =  new BinaryTree();
        Node r = new Node(1);
        tr.setRoot(r);
        tr.insert(12);
        tr.insert(2);
        tr.insert(10);
        tr.insert(34);

        tr.inOrderPrint(r);
    }
}
