package TwoLinkedList;

public class Node
{
    public int data;
    public Node next,prev;
    @Override
    public String toString() {
        return "Node{" +
                "date =" + data +
                '}';
    }

    public Node(int data) {
        this.data = data;

    }
}