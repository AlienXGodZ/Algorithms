import java.util.Arrays;

public class Test64{
    public static void main(String[] args){

        int[] height = {10, 30, 20, 40};

        int n = height.length;

        int[] dp = new int[n];

        dp[0] = 0;

        for(int i = 1; i < n; i++){

            int onestep = dp[i - 1] + Math.abs(height[i] - height[i - 1]);

            int twostep = Integer.MAX_VALUE;

            if(i > 1){

                 twostep = dp[i - 2] + Math.abs(height[i] - height[i - 1]);

            }

            dp[i] = Math.min(onestep,twostep);

        }

        System.out.println("Minimum energy: " + dp[n - 1]);

        System.out.println(Arrays.toString(dp));

    }
}