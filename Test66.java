import java.util.Arrays;

public class Test66{
    public static void main(String[] args){

        int[] money = {3, 8, 4, 10};

        int n = money.length;

        int[] dp = new int[n];

        dp[0] = money[0];
        dp[1] = Math.max(money[0],money[1]);

        for(int i = 2; i < n; i++){

            int skip = dp[i - 1];

            int take = money[i] + dp[i - 2];

            dp[i] = Math.max(skip,take);

        }

        System.out.println("DP ARRAY: " + Arrays.toString(dp));

        System.out.println("Maximum Money: " + dp[n - 1]);


    }
}