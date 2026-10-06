import java.util.Arrays;

public class Test10{

    public static void heapifydown(int i,int n,int[] arr) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {

            largest = left;

        }

        if (right < n && arr[right] > arr[largest]) {

            largest = right;

        }

        if (largest != i) {

            int temp = arr[i];

            arr[i] = arr[largest];

            arr[largest] = temp;

            heapifydown(largest,n,arr);

        }

    }

    public static void heapsort(int[] arr){

        int n = arr.length;

        for(int i = (n / 2) - 1; i >= 0; i--){

            heapifydown(i,n,arr);

        }

        for(int i = n - 1; i > 0; i--){

            int temp = arr[0];

            arr[0] = arr[i];

            arr[i] = temp;

            heapifydown(0,i,arr);

        }

    }

    public static void main(String[] args){

        int[] arr = {4,10,3,5,1};

        heapsort(arr);

        System.out.println(Arrays.toString(arr));


    }
}