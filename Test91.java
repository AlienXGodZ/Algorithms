import java.util.Arrays;

public class Test91 {

    public static int editDistance(
            String s1, String s2, int i, int j, int[][] dp) {

        // Base case 1
        if (i == s1.length()) {
            return s2.length() - j;
        }

        // Base case 2
        if (j == s2.length()) {
            return s1.length() - i;
        }

        // Check whether already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // If characters match
        if (s1.charAt(i) == s2.charAt(j)) {

            dp[i][j] = editDistance(
                    s1, s2, i + 1, j + 1, dp);

        } else {

            // Insert
            int insert = editDistance(
                    s1, s2, i, j + 1, dp);

            // Delete
            int delete = editDistance(
                    s1, s2, i + 1, j, dp);

            // Replace
            int replace = editDistance(
                    s1, s2, i + 1, j + 1, dp);

            dp[i][j] = 1 + Math.min(
                    insert,
                    Math.min(delete, replace)
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

        int result = editDistance(s1, s2, 0, 0, dp);

        System.out.println("Edit Distance: " + result);
    }
}