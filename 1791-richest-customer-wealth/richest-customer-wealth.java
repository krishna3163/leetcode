class Solution {
    public int maximumWealth(int[][] accounts) {
       int newSum = 0;
       for (int [] customers : accounts){
        int sum = 0;

        for (int account : customers){
            sum = sum + account;

        }
        if (sum > newSum ){
            newSum = sum;
        }
       }
       return newSum;
    }
}