package wk04_Lab;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int size) {
        this.elements = new int[size];
    }

    public boolean empty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int peek(int[] elements) {
        return this.elements[this.size];
    }

    public void push(int valuePush) {
        this.size += 1;
        this.elements[this.size-1] = valuePush;
    }

    public int pop() {
        this.size -= 1;
        int valuePop = this.elements[this.size];

        return valuePop;

    }

    public int getSize() {
        return this.size;
    }

}