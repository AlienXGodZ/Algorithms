import java.util.Arrays;

public class Test104 {

    public static int knapsack(
            int[] weight, int[] value,
            int index, int capacity, int[][] dp) {

        // No more items
        if (index == weight.length) {
            return 0;
        }

        // Already calculated
        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }

        // SKIP current item
        int skip = knapsack(
                weight, value, index + 1, capacity, dp);

        // TAKE current item
        int take = 0;

        if (weight[index] <= capacity) {
            take = value[index] +
                    knapsack(
                            weight, value,
                            index, capacity - weight[index], dp);
        }

        // Store maximum value
        dp[index][capacity] = Math.max(take, skip);

        return dp[index][capacity];
    }

    public static void main(String[] args) {

        int[] weight = {2, 3, 4};
        int[] value = {10, 20, 30};
        int capacity = 6;

        int[][] dp = new int[weight.length][capacity + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(
                knapsack(weight, value, 0, capacity, dp));
    }
}