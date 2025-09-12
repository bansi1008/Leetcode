class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        if(k>n){
            return res;
        }
        def(res,k,n,new ArrayList<>(),1);
        return res;

        
    }
    public static void def(List<List<Integer>> res,int k,int rem,List<Integer> cur,int s){
        if(rem==0 && cur.size()==k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=s;i<=9;i++){
            if(rem-i<0 && cur.contains(i)) break;
              cur.add(i);
              def(res,k,rem-i,cur,i+1);
              cur.remove(cur.size()-1);
        }

    
    }
}