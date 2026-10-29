public class Test70 {
    public static void main(String[] args) {

        int[] weight = {2, 3, 4};

        int[] value = {12, 20, 25};

        int capacity = 5;

        int n = weight.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            for (int w = 0; w <= capacity; w++) {

                if (weight[i - 1] <= w) {

                    int skip = dp[i - 1][w];

                    int take = value[i - 1] + dp[i - 1][w - weight[i - 1]];

                    dp[i][w] = Math.max(skip, take);


                } else {

                    dp[i][w] = dp[i - 1][w];

                }

            }
        }

        System.out.println("Maximum Value: " + dp[n][capacity]);

        System.out.println("DP Table: ");

        for (int i = 0; i <= n; i++) {

            for (int w = 0; w <= capacity; w++) {

                System.out.print(dp[i][w] + "\t");

            }

            System.out.println();

        }
    }
}