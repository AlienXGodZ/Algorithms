import java.util.*;

public class Test89 {

    public static int lis(int[] arr) {

        ArrayList<Integer> tails = new ArrayList<>();

        for (int num : arr) {

            int left = 0;
            int right = tails.size();

            // Binary search
            while (left < right) {

                int mid = left + (right - left) / 2;

                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            // Add or replace
            if (left == tails.size()) {
                tails.add(num);
            } else {
                tails.set(left, num);
            }
        }

        return tails.size();
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 4};

        System.out.println("LIS Length: " + lis(arr));
    }
}