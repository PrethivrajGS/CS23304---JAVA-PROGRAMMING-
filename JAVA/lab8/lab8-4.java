interface Stack {
    void push(int value);
    int pop();
    void clear();
}

class SimpleStack implements Stack {
    private java.util.Stack<Integer> stack = new java.util.Stack<>();

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        return stack.pop();
    }

    public void clear() {
        stack.clear();
    }
}

class main{
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        stack.clear();
    }
}
