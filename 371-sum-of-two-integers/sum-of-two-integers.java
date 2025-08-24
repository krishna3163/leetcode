class Solution {
    
    public int getSum(int a, int b) {
        return a+b ;
    
}
public static void main(String[] args){

Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      Solution solution = new Solution();
      int result = solution.getSum(a,b);
      System.out.println(result);
}
}