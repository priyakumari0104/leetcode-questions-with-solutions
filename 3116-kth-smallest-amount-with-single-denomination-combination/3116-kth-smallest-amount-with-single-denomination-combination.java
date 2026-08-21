import java.util.*;

class Solution {

    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;

        // Optional: sort and remove coins divisible by smaller coins
        Arrays.sort(coins);
        List<Integer> list = new ArrayList<>();

        for (int coin : coins) {
            boolean useful = true;

            for (int prev : list) {
                if (coin % prev == 0) {
                    useful = false;
                    break;
                }
            }

            if (useful) {
                list.add(coin);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        long low = 1;
        long high = (long) arr[0] * k;

        // Binary search for smallest number having at least k valid numbers
        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = countValid(mid, arr, k);

            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // Count numbers <= x divisible by at least one coin
    private long countValid(long x, int[] coins, int k) {
        return inclusionExclusion(x, coins, 0, 1, 0, k);
    }

    private long inclusionExclusion(
            long x,
            int[] coins,
            int index,
            long currentLCM,
            int selected,
            int k) {

        long count = 0;

        for (int i = index; i < coins.length; i++) {

            long newLCM = lcm(currentLCM, coins[i]);

            // If LCM is greater than x, x/newLCM will be 0.
            // We can skip this subset.
            if (newLCM > x || newLCM <= 0) {
                continue;
            }

            long divisible = x / newLCM;

            // Odd number of selected coins -> add
            // Even number -> subtract
            if ((selected + 1) % 2 == 1) {
                count += divisible;
            } else {
                count -= divisible;
            }

            count += inclusionExclusion(
                    x,
                    coins,
                    i + 1,
                    newLCM,
                    selected + 1,
                    k
            );

            // Avoid unnecessarily large counts
            if (count > k) {
                count = k;
            }
        }

        return count;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}