class Solution {
    public int fib(int n) {
       
        return fibo(n);
        
    }

    private int fibo(int n){
        if(n < 2){
            return n ;
        }

      return fibo(n-1) + fibo(n-2);
    }
}