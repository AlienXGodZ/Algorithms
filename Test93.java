public class Test93 {

    public static int editDistance(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        // Base case: empty first string
        for (int j = 0; j <= n; j++) {
            prev[j] = j;
        }

        for (int i = 1; i <= m; i++) {

            // Base case: empty second string
            curr[0] = i;

            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    curr[j] = prev[j - 1];

                } else {

                    int insert = curr[j - 1];

                    int delete = prev[j];

                    int replace = prev[j - 1];

                    curr[j] = 1 + Math.min(
                            insert,
                            Math.min(delete, replace)
                    );
                }
            }

            // Current row becomes previous row
            prev = curr.clone();
        }

        return prev[n];
    }

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ac";

        System.out.println(
                "Edit Distance: " + editDistance(s1, s2)
        );
    }
}