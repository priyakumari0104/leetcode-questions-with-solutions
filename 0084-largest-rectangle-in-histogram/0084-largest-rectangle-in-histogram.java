class Solution {
    public int largestRectangleArea(int[] arr) {
        int area = Integer.MIN_VALUE;
        int n = arr.length;
        int pse[] = new int[n];
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        nse[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            st.pop();
        }
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            area = Math.max(area, (arr[i] * (nse[i] - pse[i] - 1)));
        }
        return area;
    }
}