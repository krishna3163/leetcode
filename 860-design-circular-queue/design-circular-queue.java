class MyCircularQueue {
    private final int[] data;
    private final int cap;
    private int head;
    private int size;

    public MyCircularQueue(int k) {
        data = new int[k];
        cap = k;
        head = 0;
        size = 0;
    }

    // Insert an element at the rear of the queue
    public boolean enQueue(int value) {
        if (isFull()) return false;
        int tail = (head + size) % cap;  // Calculate tail position
        data[tail] = value;
        size++;
        return true;
    }

    // Delete an element from the front of the queue
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % cap;
        size--;
        return true;
    }

    // Get the front item from the queue
    public int Front() {
        if (isEmpty()) return -1;
        return data[head];
    }

    // Get the last item from the queue
    public int Rear() {
        if (isEmpty()) return -1;
        int tail = (head + size - 1) % cap;
        return data[tail];
    }

    // Checks whether the circular queue is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks whether the circular queue is full or not
    public boolean isFull() {
        return size == cap;
    }
}
