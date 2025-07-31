class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int n = temperatures.length;
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>(); 

         for(int i=0;i<n;i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int prev=stack.pop();
                a[prev]=i-prev;
            }
            stack.push(i);
            
         }
 return a;

         
             }
}