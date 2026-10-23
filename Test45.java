import java.util.ArrayList;

public class Test45{

    public static void subset(int[] arr,int index,ArrayList<Integer> store){

        if(index == arr.length){

            System.out.println(store);
            return;

        }

        store.add(arr[index]);

        subset(arr,index + 1,store);

        store.remove(store.size() - 1);

        subset(arr,index + 1,store);

    }

    public static void main(String[] args){

        int[] arr = {1,2,3};

        ArrayList<Integer> store = new ArrayList<>();

        subset(arr,0,store);

    }
}