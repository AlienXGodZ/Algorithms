//important array must be sorted

import java.util.ArrayList;

public class Test47{

    public static void combination(int[] arr,int index,int target,ArrayList<Integer> store){

        if(target == 0){

            System.out.println(store);
            return;

        }

        if(target < 0 || index == arr.length){

            return;
        }

        store.add(arr[index]);

        combination(arr,index,target - arr[index],store);

        store.remove(store.size() - 1);

        combination(arr,index + 1,target,store);

    }



    public static void main(String[] args){

        int[] arr = {2,3,6,7};

        int target = 7;

        ArrayList<Integer> store = new ArrayList<>();

        combination(arr,0,target,store);

    }
}