class Solution {
    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();

        // Count characters
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // A palindrome can have at most one odd frequency
        int odd = 0;
        int middle = -1;

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                odd++;
                middle = i;
            }
        }

        if (odd > 1) {
            return "";
        }

        // Number of each character available for LEFT half
        int[] half = new int[26];

        for (int i = 0; i < 26; i++) {
            half[i] = count[i] / 2;
        }

        int halfLen = n / 2;

        /*
         * We construct the left half.
         *
         * At every position:
         * try the smallest character possible.
         *
         * Check whether using that character
         * can still produce a palindrome > target.
         */
        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {

            boolean found = false;

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0) {
                    continue;
                }

                // Temporarily use c
                half[c]--;

                left.append((char) ('a' + c));

                // Can we complete this into a palindrome > target?
                if (canBeGreater(left, half, middle, target)) {
                    found = true;
                    break;
                }

                // Undo
                left.deleteCharAt(left.length() - 1);
                half[c]++;
            }

            if (!found) {
                return "";
            }
        }

        // Construct final palindrome
        String leftPart = left.toString();

        StringBuilder ans = new StringBuilder();

        ans.append(leftPart);

        if (middle != -1) {
            ans.append((char) ('a' + middle));
        }

        for (int i = leftPart.length() - 1; i >= 0; i--) {
            ans.append(leftPart.charAt(i));
        }

        String result = ans.toString();

        if (result.compareTo(target) > 0) {
            return result;
        }

        return "";
    }

    private boolean canBeGreater(
        StringBuilder left,
        int[] half,
        int middle,
        String target
    ) {

        int n = target.length();

        // Build the LARGEST possible remaining left half
        StringBuilder temp = new StringBuilder(left);

        for (int c = 25; c >= 0; c--) {
            while (half[c] > 0) {
                temp.append((char) ('a' + c));
                half[c]--;
            }
        }

        // Restore half
        for (int i = left.length(); i < temp.length(); i++) {
            half[temp.charAt(i) - 'a']++;
        }

        // Build maximum possible palindrome
        StringBuilder pal = new StringBuilder();

        pal.append(temp);

        if (middle != -1) {
            pal.append((char) ('a' + middle));
        }

        for (int i = temp.length() - 1; i >= 0; i--) {
            pal.append(temp.charAt(i));
        }

        return pal.toString().compareTo(target) > 0;
    }
}