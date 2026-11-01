import java.util.Arrays;

public class Test77 {

    public static int coinchange(int[] coins, int amount, int[] dp) {

        if (amount == 0) {

            return 0;

        }

        if (amount < 0) {

            return Integer.MAX_VALUE;

        }

        if (dp[amount] != -1) {

            return dp[amount];

        }

        int mincoins = Integer.MAX_VALUE;


        for (int coin : coins) {

            int result = coinchange(coins, amount - coin, dp);

            if (result != Integer.MAX_VALUE) {

                mincoins = Math.min(mincoins, result + 1);

            }

        }

        dp[amount] = mincoins;

        return dp[amount];

    }


    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        int amount = 6;

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, -1);

        int result = coinchange(coins, amount, dp);

        if (result == Integer.MAX_VALUE) {

            System.out.println(-1);

        } else {

            System.out.println(result);

        }

        System.out.println(Arrays.toString(dp));
    }

}