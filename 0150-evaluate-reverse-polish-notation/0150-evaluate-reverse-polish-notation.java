class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") &&
                    !token.equals("*") && !token.equals("/")) {
                int num = Integer.parseInt(token);
                s.push(num);

            }
            else{
                int b=s.pop();
                int a=s.pop();
                switch(token){
                    case "+": 
                      s.push(a+b);
                      break;
                    case "-":
                     s.push(a-b);
                      break;
                    case "*": 
                     s.push(a*b) ;
                     break;
                    case "/": 
                     s.push(a/b);
                     break;
                }
                
            }

        }
        return s.pop();

    }
}