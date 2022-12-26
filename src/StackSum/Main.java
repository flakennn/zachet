package StackSum;

import java.util.Stack;

public class Main
{
    public static Stack<Integer> ArrayToStack(int [] arr)
    {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        return st;
    }
    public static int sum(Stack<Integer> st)
    {
        int sum = 0;
        while(st.empty() != true)
        {
            sum += st.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,8,4,9,0,5};
        System.out.println(sum(ArrayToStack(arr)));
    }
}
