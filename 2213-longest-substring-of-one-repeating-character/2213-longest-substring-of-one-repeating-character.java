class Solution {

    class Node {
        char leftChar;
        char rightChar;
        int prefix;
        int suffix;
        int max;
        int length;

        Node(char ch) {
            leftChar = ch;
            rightChar = ch;
            prefix = 1;
            suffix = 1;
            max = 1;
            length = 1;
        }
    }

    Node[] tree;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {

        int n = s.length();
        int[] ans = new int[queryIndices.length];

        tree = new Node[4 * n];

        // Build Segment Tree
        build(s, 1, 0, n - 1);

        // Process queries
        for (int i = 0; i < queryIndices.length; i++) {

            update(
                1,
                0,
                n - 1,
                queryIndices[i],
                queryCharacters.charAt(i)
            );

            ans[i] = tree[1].max;
        }

        return ans;
    }

    // Build Segment Tree
    public void build(String s, int node, int l, int r) {

        // Leaf node
        if (l == r) {
            tree[node] = new Node(s.charAt(l));
            return;
        }

        int mid = l + (r - l) / 2;

        build(s, node * 2, l, mid);
        build(s, node * 2 + 1, mid + 1, r);

        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }

    // Update one character
    public void update(int node, int l, int r, int index, char ch) {

        if (l == r) {
            tree[node] = new Node(ch);
            return;
        }

        int mid = l + (r - l) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, ch);
        } else {
            update(node * 2 + 1, mid + 1, r, index, ch);
        }

        // Recalculate current node after update
        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }

    // Merge two segments
    public Node merge(Node left, Node right) {

        Node res = new Node(left.leftChar);

        res.leftChar = left.leftChar;
        res.rightChar = right.rightChar;

        res.length = left.length + right.length;

        // Maximum repeating prefix
        res.prefix = left.prefix;

        if (left.prefix == left.length &&
            left.rightChar == right.leftChar) {

            res.prefix = left.length + right.prefix;
        }

        // Maximum repeating suffix
        res.suffix = right.suffix;

        if (right.suffix == right.length &&
            left.rightChar == right.leftChar) {

            res.suffix = right.length + left.suffix;
        }

        // Maximum inside either segment
        res.max = Math.max(left.max, right.max);

        // Maximum crossing the boundary
        if (left.rightChar == right.leftChar) {

            res.max = Math.max(
                res.max,
                left.suffix + right.prefix
            );
        }

        return res;
    }
}