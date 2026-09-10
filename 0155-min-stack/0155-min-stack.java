class MinStack {
    int data;
    int min;
    MinStack next;

    MinStack top = null;

    public MinStack() {
        this.next = null;
    }

    public void push(int value) {
        MinStack ms = new MinStack();
        ms.data = value;

        if (top == null) {
            ms.min = value;
        } else {
            ms.min = Math.min(value, top.min);
        }

        ms.next = top;
        top = ms;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public int top() {
        return top.data;
    }

    public int getMin() {
        return top.min;
    }
}
