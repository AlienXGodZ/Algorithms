public class Test105 {

    public static int knapsack(
            int[] weight, int[] value, int capacity,int[][] dp) {

        int n = weight.length;


        // Start from the last item
        for (int i = n - 1; i >= 0; i--) {

            for (int w = 0; w <= capacity; w++) {

                // SKIP
                int skip = dp[i + 1][w];

                // TAKE
                int take = 0;

                if (weight[i] <= w) {
                    take = value[i] +
                            dp[i][w - weight[i]];
                }

                dp[i][w] = Math.max(take, skip);
            }
        }

        return dp[0][capacity];
    }

    public static void main(String[] args) {

        int[] weight = {2, 3, 4};
        int[] value = {10, 20, 30};
        int capacity = 6;

        int n = weight.length;

        int[][] dp = new int[n + 1][capacity + 1];

        System.out.println(
                knapsack(weight, value, capacity,dp));

        for(int i = 0; i <= n ;i++){

            for(int j = 0; j <= capacity; j++){

                System.out.print(dp[i][j] + "\t");

            }

            System.out.println();

        }
    }
}