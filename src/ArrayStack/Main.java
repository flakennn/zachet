package ArrayStack;

class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        stack.pop();

        stack.push(3);

        System.out.println(stack.pop());

        /* проверяем, пуст ли stack
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }*/
    }
}