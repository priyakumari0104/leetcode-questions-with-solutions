class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> temp = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = n-1; i>=0; i--) {
            temp.push(arr[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (temp.size() > 0 && arr[i] >=temp.peek()) {
                temp.pop();
            }
            if (temp.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = temp.peek();
            }
            temp.push(arr[i]);
        }
        return ans;
    }
}