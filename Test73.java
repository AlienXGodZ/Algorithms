public class Test73{
    public static void main(String[] args){

        int[] arr = {3, 5, 7};
        int target = 10;

        int n = arr.length;

        boolean[][] dp = new boolean[n+1][target + 1];

        dp[0][0] = true;

        for(int i = 1; i <= n; i++){

            for(int s = 0; s <= target; s++){

                dp[i][s] = dp[i - 1][s];

                if(arr[i - 1] <= s){

                    dp[i][s] = dp[i][s] || dp[i-1][s - arr[i - 1]];

                }

            }

        }

        System.out.println("Subset sum possible: " + dp[n][target]);

        for(int i = 0; i <= n; i++){

            for(int j = 0; j <=target ; j++){

                System.out.print(dp[i][j] + "\t");

            }

            System.out.println();

        }

    }
}