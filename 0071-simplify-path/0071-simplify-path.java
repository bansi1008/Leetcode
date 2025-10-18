class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] p = path.split("/");

        for(String s : p){
            if(s.equals("") || s.equals(".")){
                continue;
            } else if(s.equals("..")){
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s);
            }
        }

        List<String> dirs = new ArrayList<>(st);
        StringBuilder sb = new StringBuilder();
        for(String dir : dirs){
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
