class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }
            else if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                int b=asteroids[i];
                
                 while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -b) {
                   
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == -b) {
                   
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    
                    stack.push(b);
                }
            }
        }
        
         int[] a=new int[stack.size()]; 

         for(int i=stack.size()-1;i>=0;i--){
            a[i]=stack.pop();
         }

         return a;
        
    }
}