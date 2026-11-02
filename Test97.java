public class Test97 {

    public static int uniquePaths(int m, int n) {

        int[] dp = new int[n];

        // Initialize first row
        for (int j = 0; j < n; j++) {
            dp[j] = 1;
        }

        // Calculate remaining rows
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[j] = dp[j] + dp[j - 1];

            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        System.out.println(
                "Unique Paths: " + uniquePaths(m, n)
        );
    }
}