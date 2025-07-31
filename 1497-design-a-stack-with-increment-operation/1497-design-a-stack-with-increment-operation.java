class CustomStack {
 private Stack<Integer> stack;
  private int maxsize;
    public CustomStack(int maxSize) {
        stack=new Stack<>();
        this.maxsize=maxSize;

        
    }
    
    public void push(int x) {
        if(stack.size()< maxsize){
            
            stack.push(x);
        }
        
    }
    
    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }
        
        return stack.pop();
        
        
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, stack.size());
       
           
            for(int i=0;i<limit;i++){
                stack.set(i, stack.get(i) + val);
                
            
        }
         

            
         
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */