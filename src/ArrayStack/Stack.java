package ArrayStack;

class Stack
{
    private int arr[];
    private int top;
    private int capacity;

    // Конструктор для инициализации stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Вспомогательная функция для добавления элемента `x` в stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Stack overflow");
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Вспомогательная функция для извлечения верхнего элемента из stack
    public int pop()
    {
        // проверка на опустошение stack
        if (isEmpty())
        {
            System.out.println("Stack underflow");
        }

        // уменьшаем размер stack на 1 и (необязательно) возвращаем извлеченный элемент
        return arr[top--];
    }


    // Вспомогательная функция для проверки, пуст stack или нет
    public boolean isEmpty() {
        return top == -1;               // или return size() == 0;
    }

    // Вспомогательная функция для проверки, заполнен ли stack или нет
    public boolean isFull() {
        return top == capacity - 1;     // или return size() == capacity;
    }
}