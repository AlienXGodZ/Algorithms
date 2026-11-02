
import java.util.Arrays;

public class Test108 {

    public static int rodCut(
            int[] length, int[] price,
            int index, int rodLength, int[][] dp) {

        // No more piece lengths
        if (index == length.length) {
            return 0;
        }

        // Already calculated
        if (dp[index][rodLength] != -1) {
            return dp[index][rodLength];
        }

        // SKIP current piece length
        int skip = rodCut(
                length, price,
                index + 1, rodLength, dp);

        // TAKE current piece length
        int take = 0;

        if (length[index] <= rodLength) {
            take = price[index] +
                    rodCut(
                            length, price,
                            index, rodLength - length[index], dp);
        }

        // Store maximum profit
        dp[index][rodLength] = Math.max(take, skip);

        return dp[index][rodLength];
    }

    public static void main(String[] args) {

        int[] length = {1, 2, 3, 4};
        int[] price = {2, 5, 7, 8};

        int rodLength = 4;

        int[][] dp = new int[length.length][rodLength + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(
                rodCut(length, price, 0, rodLength, dp));
    }
}
