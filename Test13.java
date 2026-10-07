import java.util.Arrays;

public class Test13 {
    public static void main (String[] args){

        int[] arr = {10,2,6,5,4};

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int total = arr[left] + arr[right];

            if(total == 10){

                System.out.println(arr[left] + " " + arr[right]);

            }

            if(total < 10){

                left++;

            }else{

                right--;

            }

        }

        System.out.println("Not Found");

    }
}
