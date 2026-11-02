import java.util.Arrays;

public class Test112 {

    public static int change(int[] coins, int index, int amount, int[][] dp) {

        if (amount == 0) {
            return 1;
        }

        if (index == coins.length) {
            return 0;
        }

        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        // SKIP
        int skip = change(coins, index + 1, amount, dp);

        // TAKE
        int take = 0;

        if (coins[index] <= amount) {
            take = change(coins, index, amount - coins[index], dp);
        }

        return dp[index][amount] = take + skip;
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 5;

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(change(coins, 0, amount, dp));
    }
}