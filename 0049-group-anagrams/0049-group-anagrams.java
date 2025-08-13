class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map< String, List<String>> map=new HashMap<>();
       
       
       for(String w:strs){
        char[] c=w.toCharArray();
        Arrays.sort(c);
        String s=new String(c);
        map.computeIfAbsent(s,k->new ArrayList<>()).add(w);




       }

       return new ArrayList<>(map.values());
        



        
    }
}