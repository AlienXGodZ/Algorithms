
public class Test85 {

    public static int longestCommonSubstring(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        int maxLength = 0;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    curr[j] = 1 + prev[j - 1];

                    maxLength = Math.max(maxLength, curr[j]);

                } else {

                    curr[j] = 0;
                }
            }

            prev = curr.clone();

            // Reset current row
            curr = new int[n + 1];
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcjkl";
        String s2 = "abjkl";

        int result = longestCommonSubstring(s1, s2);

        System.out.println("Longest Common Substring: " + result);
    }
}
