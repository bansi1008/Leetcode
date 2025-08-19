class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!stacks.isEmpty())
                    stacks.pop();
            } else {
                stacks.push(c);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!stackt.isEmpty())
                    stackt.pop();

            } else {
                stackt.push(c);
            }

        }

        while (!stacks.isEmpty() && !stackt.isEmpty()) {
            if (stacks.pop() != stackt.pop()) {
                return false;
            }
        }

        return stacks.isEmpty() && stackt.isEmpty();
    }
}