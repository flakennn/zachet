package Stack;

import java.util.LinkedList;

public class Stack
{
    private LinkedList<Integer> list;

    public int number_of_elements()
    {
        return list.size();
    }
    public Stack() {
        list = new LinkedList<>();
    }
    public void Push(int a)
    {
        list.add(a);
    }
    public int Pop()
    {
        if (number_of_elements() > 0){
            return list.removeLast();
        }
        else return 0;
    }
}
