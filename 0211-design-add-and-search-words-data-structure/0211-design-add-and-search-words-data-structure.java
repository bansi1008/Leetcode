class WordDictionary {
     boolean word;
     Map<Character, WordDictionary> child;

    public WordDictionary() {
        word=false; 
        child = new HashMap<>();
        
    }
    
    public void addWord(String word) {
     WordDictionary curr=this;
     for(char c:word.toCharArray()){
        if(!curr.child.containsKey(c)){
            curr.child.put(c,new WordDictionary() );
        }
         curr=curr.child.get(c);
     }  
      curr.word=true;

    
        
    }
    
    public boolean search(String word) {
       return searchHelper(word, 0, this);


        
    }
    private boolean searchHelper(String word, int index, WordDictionary node) {
    if (index == word.length()) {
        return node.word;
    }

    char c = word.charAt(index);
    if (c == '.') {
        for (WordDictionary childNode : node.child.values()) {
            if (searchHelper(word, index + 1, childNode)) {
                return true;
            }
        }
        return false;
    } else {
        if (!node.child.containsKey(c)) {
            return false;
        }
        return searchHelper(word, index + 1, node.child.get(c));
    }
}


}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */