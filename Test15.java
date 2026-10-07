import java.util.Arrays;

public class Test15 {
    public static void main(String[] args){

        int[] arr = {10,5,7,0,2,1,0};

        int slow = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){

                int temp = arr[slow];

                arr[slow] = arr[i];

                arr[i] = temp;

                slow++;


            }


        }

        System.out.print(Arrays.toString(arr));

    }
}
