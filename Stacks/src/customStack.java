public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public boolean isFull() {
        if (pointer == data.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (pointer == -1) {
            return true;
        }
        return false;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty:(.");
        }
        return data[pointer];
    }
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty:(.");
        }
        int num = data[pointer];
        pointer--;
        return num;
    }
}