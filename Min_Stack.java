class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> valStack = new Stack<>();
    public void push(int x) {
        valStack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
            return;
        }
        if (minStack.peek() > x) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        valStack.pop();
    }

    public int top() {
        return valStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

