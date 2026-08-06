class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> temp = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[nums1.length];
        map.put(nums2[nums2.length-1],-1);
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (temp.size() > 0) {
                if (nums2[i] >= temp.peek()) {
                    temp.pop();
                    if (temp.size() == 0) {
                        map.put(nums2[i], -1);
                    }
                } else {
                    map.put(nums2[i], temp.peek());
                    break;
                }
            }
            temp.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}