class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(products);

        String pre = "";

        for (int i = 0; i < searchWord.length(); i++) {
            pre += searchWord.charAt(i);
            List<String> sug = new ArrayList<>();
            int c=0;
            
            for (String p : products ) {

                if (p.startsWith(pre) && c<3) {
                    sug.add(p);
                    c++;
                }
            }
            
            res.add(sug);

        }

        return res;
    }
}