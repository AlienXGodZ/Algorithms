public class Test71{

    public static boolean subset(int[] arr,int target,int index){

        if(target == 0){

            return true;

        }

        if(index == arr.length){

            return false;

        }

        if(arr[index] <= target){

            if(subset(arr,target - arr[index],index + 1)){

                return true;

            }

        }

        return subset(arr,target,index + 1);

    }

    public static void main(String[] args){

            int[] arr = {3, 5, 7};
            int target = 10;

            boolean result = subset(arr,target,0);

            System.out.println("Subset sum Probablity: " + result);


        }
}