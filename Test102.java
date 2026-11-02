import java.util.Arrays;

public class Test102 {

    public static int minPathSum(int[][] grid,int[] dp) {

        int m = grid.length;
        int n = grid[0].length;



        // First cell
        dp[0] = grid[0][0];

        // First row
        for (int j = 1; j < n; j++) {
            dp[j] = grid[0][j] + dp[j - 1];
        }

        // Remaining rows
        for (int i = 1; i < m; i++) {

            // First column
            dp[0] = dp[0] + grid[i][0];

            for (int j = 1; j < n; j++) {

                dp[j] = grid[i][j] +
                        Math.min(dp[j], dp[j - 1]);
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];

        System.out.println(minPathSum(grid,dp));

        System.out.println(Arrays.toString(dp));


    }
}