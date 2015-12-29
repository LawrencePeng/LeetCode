class Stack {
public:
    // Push element x onto stack.
    queue<int> q1;
    queue<int> q2;
    void push(int x) {
        q1.push(x);
    }

    // Removes the element on top of the stack.
    void pop() {
        while(q1.size() != 1) {
            int tmp = q1.front();
            q1.pop();
            q2.push(tmp);
        }
        q1.pop();
        while(q2.size()) {
            int tmp2 = q2.front();
            q2.pop();
            q1.push(tmp2);
        }
    }

    // Get the top element.
    int top() {
        while(q1.size() != 1) {
            int tmp = q1.front();
            q1.pop();
            q2.push(tmp);
        }
        int ans = q1.front();
        int tmp = q1.front();
            q1.pop();
            q2.push(tmp);
        while(q2.size()) {
            int tmp2 = q2.front();
            q2.pop();
            q1.push(tmp2);
        }
        return ans;
    }

    // Return whether the stack is empty.
    bool empty() {
        return q1.empty();
    }
};
