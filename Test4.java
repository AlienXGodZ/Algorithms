import java.util.Arrays;

public class Test4{
    public static void main(String[] args){

        int[] arr = {50,10,20,60,30};

        for(int i = 0; i < arr.length; i++){

            for(int j = 0 ; j < arr.length - 1 - i; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j+1] = temp;

                }

            }

        }

        System.out.println(Arrays.toString(arr));


    }

}