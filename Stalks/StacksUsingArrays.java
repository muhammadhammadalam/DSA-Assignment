class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot add " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed " + value);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return stack[top--];
    }

    // Peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
