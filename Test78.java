
import java.util.Arrays;

public class Test78 {

    public static int coinChange(int[] coins, int amount,int[] dp) {

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {

                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        int amount = 6;

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        System.out.println(coinChange(coins, amount,dp));

        for(int i = 0; i <= coins.length; i++){

                System.out.print(dp[i]);

            }

        }
    }

