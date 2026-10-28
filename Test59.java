import java.util.Arrays;

public class Test59{

    public static int fab(int n,int[] dp){

        if(n == 0 || n == 1){

            return n;

        }

        if(dp[n] != -1){

            return dp[n];

        }

        dp[n] = fab(n - 1,dp) + fab(n - 2,dp);

        return dp[n];



    }


    public static void main(String[] args){

        int n = 6;

        int[] dp = new int[n + 1];

        Arrays.fill(dp,-1);

        int result = fab(n,dp);

        System.out.println("fibonacci of " + n + " = " + result);

        System.out.println("DP ARRAY: " + Arrays.toString(dp));

    }
}