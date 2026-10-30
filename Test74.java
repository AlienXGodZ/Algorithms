public class Test74 {

    public static boolean subsetSum(
            int[] arr, int target, Boolean[][] dp, int index) {

        if (target == 0) {
            return true;
        }

        if (index == arr.length) {
            return false;
        }

        if (dp[index][target] != null) {
            return dp[index][target];
        }

        if (arr[index] <= target) {

            if (subsetSum(arr, target - arr[index], dp, index + 1)) {
                dp[index][target] = true;
                return true;
            }
        }

        boolean result = subsetSum(arr, target, dp, index + 1);

        dp[index][target] = result;

        return result;
    }

    public static boolean canPartition(int[] arr) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;

        Boolean[][] dp = new Boolean[arr.length][target + 1];

        return subsetSum(arr, target, dp, 0);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6};

        System.out.println(canPartition(arr));
    }
}