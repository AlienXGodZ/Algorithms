import java.util.Arrays;
import java.util.Collections;

public class Test2 {
    public static void main(String args[]){

        int[] arr = {50,30,70,20,90,40,10};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;
        int target = 50;

        while(left <= right){

            int mid = ( left + right )/ 2;

            if(arr[mid] == target){

                System.out.println("Found at " + "Index " + mid);
                return;

            }

            if (target < arr[mid]) {

                right = mid - 1;

            }

            else if(target > arr[mid]){

                left = mid + 1;

            }

        }

        System.out.println();
        System.out.println("Not Found");

        //for converting array sort into reverse order (extra knowledge)

        int reverseleft = 0;
        int reverseright = arr.length - 1;

        while(reverseleft < reverseright){

            int temp = arr[reverseleft];
            arr[reverseleft] = arr[reverseright];
            arr[reverseright] = temp;

            reverseleft++;
            reverseright--;

        }

        System.out.println(Arrays.toString(arr));





    }
}
