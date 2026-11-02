
public class Test109 {

    public static int rodCut(int[] length, int[] price, int rodLength) {

        int n = length.length;

        int[][] dp = new int[n + 1][rodLength + 1];

        // Start from the last piece length
        for (int i = n - 1; i >= 0; i--) {

            for (int r = 0; r <= rodLength; r++) {

                // SKIP
                int skip = dp[i + 1][r];

                // TAKE
                int take = 0;

                if (length[i] <= r) {
                    take = price[i] + dp[i][r - length[i]];
                }

                dp[i][r] = Math.max(take, skip);
            }
        }

        return dp[0][rodLength];
    }

    public static void main(String[] args) {

        int[] length = {1, 2, 3, 4};
        int[] price = {2, 5, 7, 8};

        int rodLength = 4;

        System.out.println(rodCut(length, price, rodLength));
    }
}
