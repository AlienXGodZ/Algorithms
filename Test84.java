public class Test84{

    public static int lcs(String s1,String s2,int[][] dp){

        int m = s1.length();
        int n = s2.length();

        int minlength = 0;

        for(int i = 1; i <= m; i++){

            for(int j = 1; j <= n; j++){

                if(s1.charAt(i - 1) == s2.charAt(j - 1)){

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    minlength = Math.max(minlength,dp[i][j]);

                }else{

                    dp[i][j] = 0;

                }

            }

        }

        return dp[m][n];



    }


    public static void main(String[] args){

        String s1 = "abcjkl";
        String s2 = "abjkl";

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        int result = lcs(s1,s2,dp);

        System.out.println("Longest common Substring: " + result);

        for(int i = 0; i <= s1.length(); i++){

            for(int j = 0; j <= s2.length(); j++){

                System.out.print(dp[i][j] + " ");

            }

            System.out.println();

        }


    }
}