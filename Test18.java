public class Test18{
    public static void main(String[] args){

        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3;

        int windowssum = 0;

        for(int i = 0; i < k; i++){

            windowssum += arr[i];

        }

        int maxcount = windowssum;

        for(int i = k; i < arr.length; i++){

            windowssum = windowssum - arr[i - k] + arr[i];


            if(maxcount < windowssum){

                maxcount = windowssum;

            }



        }

        System.out.println(maxcount);


    }
}