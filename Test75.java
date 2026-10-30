public class Test75 {

    public static boolean canPartition(int[] arr) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;
        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s <= target; s++) {

                // Skip the current element
                dp[i][s] = dp[i - 1][s];

                // Take the current element
                if (arr[i - 1] <= s) {

                    dp[i][s] = dp[i][s] ||
                            dp[i - 1][s - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6};

        System.out.println(canPartition(arr));
    }
}