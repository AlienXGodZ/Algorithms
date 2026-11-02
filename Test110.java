
public class Test110 {

    public static int rodCut(
            int[] length, int[] price, int rodLength) {

        int n = length.length;

        int[] dp = new int[rodLength + 1];

        for (int i = n - 1; i >= 0; i--) {

            for (int r = length[i]; r <= rodLength; r++) {

                dp[r] = Math.max(
                        dp[r],
                        price[i] + dp[r - length[i]]
                );
            }
        }

        return dp[rodLength];
    }

    public static void main(String[] args) {

        int[] length = {1, 2, 3, 4};
        int[] price = {2, 5, 7, 8};

        int rodLength = 4;

        System.out.println(
                rodCut(length, price, rodLength)
        );
    }
}
