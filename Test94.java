public class Test94 {

    public static int uniquePaths(int m, int n,int[][] dp) {



        // First row
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // First column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Calculate remaining cells
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i - 1][j]
                        + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[][] dp = new int[m][n];

        System.out.println("Unique Paths: "
                + uniquePaths(m, n,dp));

        for(int i = 0; i < m; i++){

            for(int j = 0; j < n; j++){

                System.out.print(dp[i][j] + "\t");

            }

            System.out.println();

        }
    }
}