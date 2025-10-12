class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        Set<Character> s = new HashSet<>();

        for (char c : brokenLetters.toCharArray()) {
            s.add(c);
        }
        int n = text.length();
      
        int c = 0;

        String[] w = text.split(" ");

        for(String wo:w){
            boolean ca=true;

            for(char ch:wo.toCharArray()){
                if(s.contains(ch)){
                    ca=false;
                    break;
                }

            }

            if(!ca){
                c++;
            }

        }

return w.length-c;
    }
}