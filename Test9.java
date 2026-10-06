import java.util.Arrays;

public class Test9{

    public static void quicksort(int[] arr,int low,int high){

        if(low < high){

            int pivotindex = partition(arr,low,high);

            quicksort(arr,low,pivotindex - 1);

            quicksort(arr,pivotindex + 1,high);

        }

    }

    public static int partition(int[] arr,int low,int high){


        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j < high; j++){

            if(arr[j] < pivot){

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }


    public static void main(String[] args){

        int[] arr = {7,1,8,9,5,6,2};

        quicksort(arr,0,arr.length-1);


        System.out.println(Arrays.toString(arr));




    }
}