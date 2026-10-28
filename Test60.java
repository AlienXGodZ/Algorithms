import java.util.ArrayList;
import java.util.Arrays;

public class Test60 {
    public static void main(String[] args){

        int n = 6;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= 6;i++){

            dp[i] = dp[i -1] + dp[i - 2];

        }

        System.out.println("Answer: " + dp[n]);

        System.out.println(Arrays.toString(dp));


    }
}
