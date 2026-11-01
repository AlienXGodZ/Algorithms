
import java.util.Arrays;

public class Test80 {

    public static int lcs(String s1, String s2, int i, int j,
                          int[][] dp) {

        // Base condition
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        // Already calculated?
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Characters match
        if (s1.charAt(i) == s2.charAt(j)) {

            dp[i][j] = 1 + lcs(
                    s1, s2, i + 1, j + 1, dp
            );

        } else {

            // Characters do not match
            dp[i][j] = Math.max(
                    lcs(s1, s2, i + 1, j, dp),
                    lcs(s1, s2, i, j + 1, dp)
            );
        }

        return dp[i][j];
    }

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ac";

        int[][] dp = new int[s1.length()][s2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = lcs(s1, s2, 0, 0, dp);

        System.out.println("LCS Length: " + result);

        for(int i = 0 ; i < s1.length(); i++ ){

            for(int j = 0; j < s2.length(); j++){

                System.out.print(dp[i][j] + " ");

            }

            System.out.println();

        }
    }
}
