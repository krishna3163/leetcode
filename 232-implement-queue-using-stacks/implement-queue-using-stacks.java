

class MyQueue { //Deque : Double-ended queue
    private Deque<Integer> inStack;  // Stack to hold incoming elements
    private Deque<Integer> outStack; // Stack to remove elements from the queue

    public MyQueue() { // Constructor to initialize the stacks
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    // Enqueue (O(1)): Push element to inStack
    public void push(int x) { 
        inStack.push(x);  // Adds element to the inStack
    }

    // Dequeue (Amortized O(1)): Pop element from outStack
    public int pop() {  
        moveIfNeeded();   // Ensure outStack has elements before popping
        return outStack.pop(); // Removes and returns the element from outStack
    }

    // Peek (Amortized O(1)): Look at the front element of the queue
    public int peek() { 
        moveIfNeeded();   // Ensure outStack has elements before peeking
        return outStack.peek(); // Returns the front element without removing it
    }

    // Check if the queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty(); // Queue is empty if both stacks are empty
    }

    // Helper: Move elements from inStack to outStack if outStack is empty
    private void moveIfNeeded() {
        if (outStack.isEmpty()) { // If outStack is empty, transfer all elements from inStack
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop()); // Pop from inStack and push to outStack
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
