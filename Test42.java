public class Test42 {

    public static boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if(nums.length - 1 <= maxReach){

                System.out.println("found at: " + i);
                return true;

            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 3, 3, 4};

        boolean answer = canJump(nums);

        System.out.println(answer);
    }
}
