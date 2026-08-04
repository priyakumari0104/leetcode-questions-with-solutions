class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        Stack<String> st = new Stack();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            
                if (logs[i].equals("../")) {
                    if(st.size()>0){
                        st.pop();
                    }
                } else if (logs[i].equals("./")) {
                    continue;
                } else {
                    st.push(logs[i]);
                }
            }
        
        return st.size();
    }
}