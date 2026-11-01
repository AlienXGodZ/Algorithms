
import java.util.Arrays;

public class Test87 {

    public static int lis(int[] arr, int index,
                          int prevIndex, int[][] dp) {

        // Base condition
        if (index == arr.length) {
            return 0;
        }

        // Convert prevIndex into a valid DP column
        int prev = prevIndex + 1;

        // Already calculated?
        if (dp[index][prev] != -1) {
            return dp[index][prev];
        }

        // Choice 1: Skip current element
        int skip = lis(arr, index + 1, prevIndex, dp);

        // Choice 2: Take current element
        int take = 0;

        if (prevIndex == -1 || arr[index] > arr[prevIndex]) {

            take = 1 + lis(arr, index + 1, index, dp);
        }

        // Store the best answer
        dp[index][prev] = Math.max(take, skip);

        return dp[index][prev];
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 4};

        int n = arr.length;

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = lis(arr, 0, -1, dp);

        System.out.println("LIS Length: " + result);
    }
}
