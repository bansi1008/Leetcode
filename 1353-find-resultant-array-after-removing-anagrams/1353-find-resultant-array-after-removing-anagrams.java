class Solution {
    public List<String> removeAnagrams(String[] words) {

                List<String> res = new ArrayList<>();
                res.add(words[0]);

                for(int i=1;i<words.length;i++){
                    String prev=sortt(res.get(res.size()-1));
                    String curr=sortt(words[i]);

                    if(!prev.equals(curr)){
                        res.add(words[i]);
                    }

                }
                return res;

        
    }
     private String sortt(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}