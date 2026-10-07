import java.util.Arrays;

public class Test11{
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;


        }

        System.out.println(Arrays.toString(arr));

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");

        }







    }
}