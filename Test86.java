public class Test86{

    public static int lcs(int[] arr,int index,int prev) {

        if (index == arr.length) {

            return 0;

        }

        int skip = lcs(arr, index + 1, prev);

        int take = 0;

        if (prev == -1 || arr[index] > arr[prev]) {

            take = 1 + lcs(arr, index + 1, index);

        }

        return Math.max(take, skip);

    }

    public static void main(String[] args){

        int[] arr = {3, 1, 2, 5, 4};

        System.out.println("LIS LENGTH: " + lcs(arr,0,-1));

    }
}