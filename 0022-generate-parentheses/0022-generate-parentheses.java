class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        
        backtrack(res,"",n,0,0); 
        return res;
        
    }

    public static void backtrack(List<String> res,String curent,int n,int o,int c){
    int max=n*2;
        if(curent.length()==max){
            res.add(curent);
            return;
        }

        if(o<n){
            backtrack(res,curent+"(",n,o+1,c);
        }
        if(c<o){
            backtrack(res,curent+")",n,o,c+1);
        }
    }
}