import java.util.Arrays;

public class Test96 {

    public static int uniquePaths(
            int i, int j, int m, int n, int[][] dp) {

        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Outside the grid
        if (i >= m || j >= n) {
            return 0;
        }

        // Already calculated?
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move down
        int down = uniquePaths(i + 1, j, m, n, dp);

        // Move right
        int right = uniquePaths(i, j + 1, m, n, dp);

        // Store the answer
        dp[i][j] = down + right;

        return dp[i][j];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = uniquePaths(0, 0, m, n, dp);

        System.out.println("Unique Paths: " + result);
    }
}