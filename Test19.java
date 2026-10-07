public class Test19{
    public static void main(String[] args){

        int[] arr = {2,3,1,2,4,3};

        int left = 0;

        int sum = 0;

        int target = 8;

        int minlength = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++){

            sum += arr[right];


            while(sum == target){

                minlength = Math.min(minlength,right - left + 1);
                sum -= arr[left];
                left++;

            }

        }

        System.out.println(minlength);







    }
}