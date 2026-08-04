class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxcount = 0;
        Stack<Character> st = new Stack();
        // st.push(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='(') {
                st.push(ch);
                count++;
            } else if (st.size() > 0 && ch==')') {
                st.pop();
                count--;
            }
            maxcount = Math.max(count, maxcount);

        }
        return maxcount;
    }
}