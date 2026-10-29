public class Test72{

    public static boolean subset(int[] arr,int target,Boolean[][] condition,int index){

        if(target == 0){

            return true;

        }

        if(index == arr.length){

            return false;

        }

        if(condition[index][target] != null){

            return condition[index][target];

        }

        if(arr[index] <= target){

           if(subset(arr,target - arr[index],condition,index + 1)){

               condition[index][target] = true;

               return true;


           }

        }

        boolean result = subset(arr,target,condition,index + 1);

        condition[index][target] = result;

        return result;

    }

    public static void main(String[] args){

        int[] arr = {3, 5, 7};
        int target = 10;

        Boolean[][] condition = new Boolean[arr.length][target + 1];

        boolean result = subset(arr,target,condition,0);

        System.out.println("Subset sum Possible :" + result);

    }
}