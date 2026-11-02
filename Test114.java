public class Test114 {

    public static int change(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        dp[0] = 1;

        for (int coin : coins) {

            for (int a = coin; a <= amount; a++) {

                dp[a] += dp[a - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 5;

        System.out.println(change(coins, amount));
    }
}