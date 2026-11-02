import java.util.Arrays;

public class Test99 {

    public static int minPathSum(int[][] grid, int i, int j, int[][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        // Destination reached
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        // Outside the grid
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = minPathSum(grid, i + 1, j, dp);

        int right = minPathSum(grid, i, j + 1, dp);

        dp[i][j] = grid[i][j] + Math.min(down, right);

        return dp[i][j];
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(minPathSum(grid, 0, 0, dp));
    }
}