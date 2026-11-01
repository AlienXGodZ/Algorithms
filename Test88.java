public class Test88 {

    public static int lis(int[] arr) {

        int n = arr.length;

        int[][] dp = new int[n + 1][n + 1];

        // Start from the last index
        for (int index = n - 1; index >= 0; index--) {

            // Previous index must be before current index
            for (int prevIndex = index - 1; prevIndex >= -1; prevIndex--) {

                // Option 1: Skip current element
                int skip = dp[index + 1][prevIndex + 1];

                // Option 2: Take current element
                int take = 0;

                if (prevIndex == -1 || arr[index] > arr[prevIndex]) {

                    take = 1 + dp[index + 1][index + 1];

                }

                dp[index][prevIndex + 1] = Math.max(take, skip);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 4};

        System.out.println("LIS Length: " + lis(arr));
    }
}