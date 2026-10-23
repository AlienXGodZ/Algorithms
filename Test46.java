import java.util.ArrayList;

public class Test46{

    public static void permutations(int[] arr,boolean[] used,ArrayList<Integer> store){

        if(store.size() == arr.length){

            System.out.println(store);
            return;

        }

        for(int i = 0; i < arr.length; i++){

            if(used[i]){

                continue;

            }

            store.add(arr[i]);
            used[i] = true;

            permutations(arr,used,store);

            store.remove(store.size() - 1);

            used[i] = false;

        }

    }

    public static void main(String[] args){

        int[] arr = {1,2,3};

        ArrayList<Integer> store = new ArrayList<>();

        boolean[] used = new boolean[arr.length];

        permutations(arr,used,store);

    }
}