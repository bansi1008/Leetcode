class MinStack {

Stack<int[]> stack;
    public MinStack() {
        stack =new Stack<>();

        
    }
    
    public void push(int val) {
        int[] single= new int[]{val};
        stack.push(single);
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        int[] topa= stack.peek();
        return topa[0];
        
    }
    
    public int getMin() {
          
        int min=Integer.MAX_VALUE;;
        for(int[] arr : stack){
            for(int num : arr)
            {
                    if(num<min){
                        min=num;
                    } 
            }
            

        }
        
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */