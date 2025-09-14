class Trie {
boolean word;
Map<Character, Trie> child;


    public Trie() {
         word=false; 
        child = new HashMap<>();

        
    }
    
    public void insert(String word) {
        Trie curr=this;
        for(char c:word.toCharArray()){
            if(!curr.child.containsKey(c)){
                curr.child.put(c,new Trie());
               
            }
             curr=curr.child.get(c);
        }
        curr.word=true;
        
    }
    
    public boolean search(String word) {
        Trie curr=this;
          for(char c:word.toCharArray()){
            if(!curr.child.containsKey(c)){
                return false;
               
            }
            curr=curr.child.get(c);
          }
           return curr.word;

        
    }
    
    public boolean startsWith(String prefix) {
        Trie curr=this;
          for(char c:prefix.toCharArray()){
            if(!curr.child.containsKey(c)){
                return false;
               
            }
            curr=curr.child.get(c);
          }
           return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */