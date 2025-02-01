interface StackADT {
    void push(int value) throws Exception;
    int pop() throws Exception;
    int peek() throws Exception;
    boolean isEmpty();
    boolean isFull();
}

class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow");
        }
        stack[++top] = value;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        try {
            ArrayStack stack = new ArrayStack(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element is " + stack.peek());
            stack.pop();
            System.out.println("Top element after pop is " + stack.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}