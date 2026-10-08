import java.util.Arrays;

public class Test21 {
    public static void main(String[] args){

        int[] arr = {2,4,1,7,3,6};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){

            prefix[i] = prefix[i-1] + arr[i];

        }

        System.out.println(Arrays.toString(prefix));

        int sum = 0;

        int left = 2;
        int right = 5;

        if(left == 0){

            sum = prefix[right];

        }else {

            sum = prefix[right] - prefix[left - 1];

        }

        System.out.println("Sum of Index From " + left + " to " + right + " is " +  sum);



    }
}
