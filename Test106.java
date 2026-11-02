import java.util.Arrays;

public class Test106 {

    public static int knapsack(
            int[] weight, int[] value, int capacity,int[] dp) {

        int n = weight.length;

        for (int i = n - 1; i >= 0; i--) {

            for (int w = weight[i]; w <= capacity; w++) {

                dp[w] = Math.max(
                        dp[w],
                        value[i] + dp[w - weight[i]]
                );
            }
        }

        return dp[capacity];
    }

    public static void main(String[] args) {

        int[] weight = {2, 3, 4};
        int[] value = {10, 20, 30};
        int capacity = 6;
        int[] dp = new int[capacity + 1];

        System.out.println(
                knapsack(weight, value, capacity,dp)
        );

        System.out.println(Arrays.toString(dp));
    }
}