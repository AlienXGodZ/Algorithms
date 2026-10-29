
import java.util.Arrays;

public class Test68 {
    public static void main(String[] args) {
        int[] a = {4, 5, 4};
        int n = a.length;

        int[] dp = new int[n];

        dp[0] = a[0];

        if (n > 1) {
            dp[1] = Math.max(a[0], a[1]);
        }

        for (int i = 2; i < n; i++) {
            int skip = dp[i - 1];
            int take = a[i] + dp[i - 2];

            dp[i] = Math.max(skip, take);
        }

        System.out.println("DP array: " + Arrays.toString(dp));
        System.out.println("Maximum sum: " + dp[n - 1]);
    }
}
