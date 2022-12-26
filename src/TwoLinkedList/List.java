package TwoLinkedList;

public class List
{
    private Node head;
    private Node tail;

    public List()
    {
        head = null;
        tail = null;
    }

    public boolean IsEmpty()
    {
        return head == null;
    }

    public void addInHead(int data)
    {
        Node temp = new Node(data);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        }
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
    public void deleteNodeHead()
    {
        head = head.next;
    }

    public void deleteNodeTail() {
        tail.prev.next = null;
        tail.prev = null;
        //tail = tail.prev;
    }

    public void addInTail(int data)
    {
        Node temp = new Node(data);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
