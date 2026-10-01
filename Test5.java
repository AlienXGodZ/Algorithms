import java.util.Arrays;

public class Test5 {
    public static void main(String[] args){

        int[] arr =  {5, 3, 8, 1, 4};

        for(int i = 0; i < arr.length - 1; i++){

            int minindex = i;

            for(int j = i + 1 ; j < arr.length; j++){

                if(arr[j] < arr[minindex]){

                    minindex = j;

                }
            }

            int temp = arr[i];

            arr[i] = arr[minindex];

            arr[minindex] = temp;


        }

        System.out.println(Arrays.toString(arr));

    }
}
