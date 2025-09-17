class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);  // min heap with capacity of KthLargest
        //add initial element to the heap
        for(int num : nums){
            add(num);
        }

        
    }
    public int add(int val){
        if (minHeap.size() < k){
            minHeap.offer(val);
        }
        else if(val > minHeap.peek()){
            minHeap.poll();  //remove the smallest element
            minHeap.offer(val); //add the new value

        }
        return minHeap.peek(); //return the kth largest element
    }
    

        
    }


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */