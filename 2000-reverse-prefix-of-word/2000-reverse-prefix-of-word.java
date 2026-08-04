class Solution {
    public String reversePrefix(String word, char x) {
        int idx = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            return word;
        }
        StringBuilder st = new StringBuilder();
        for (int i = 0; i <= idx; i++) {
            st.append(word.charAt(i));
        }
        st.reverse();
        for (int i = idx + 1; i < word.length(); i++) {
            st.append(word.charAt(i));
        }
        return st.toString();
    }
}