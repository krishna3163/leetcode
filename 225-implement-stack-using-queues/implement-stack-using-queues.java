

class MyStack {

    private Queue<Integer> q1; // Main queue (stores the current stack)
    private Queue<Integer> q2; // Helper queue (used during push operation)

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        // Step 1: Add the new element to q2
        q2.offer(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        return q1.poll(); // Since q1 is always the "current stack", front is top
    }

    // Get the top element of the stack
    public int top() {
        return q1.peek(); // Return the front of q1
    }

    // Returns true if the stack is empty
    public boolean empty() {
        return q1.isEmpty(); // If q1 is empty, stack is empty
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
