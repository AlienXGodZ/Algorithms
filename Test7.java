import java.util.Arrays;

public class Test7 {
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};

            int key = arr[arr.length - 1];

            int j = arr.length - 2;

            while(j >= 0){

                arr[j + 1] = arr[j];
                j--;

        }

            arr[j+1] = key;

            System.out.println(Arrays.toString(arr));
    }

}
