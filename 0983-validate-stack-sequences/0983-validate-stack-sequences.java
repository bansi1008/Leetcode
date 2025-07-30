class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
 Stack<Integer> stack = new Stack<>();
        int popIndex = 0;



        for(int val:pushed){
            stack.push(val);
            while(!stack.isEmpty()&&stack.peek()==popped[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

     return stack.isEmpty();
        
    }
}