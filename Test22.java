import java.util.HashMap;

public class Test22 {
    public static void main(String[] args){

        int[] arr =  {1, 2, 1, 3, 2, 1};

        HashMap<Integer,Integer> store = new HashMap<>();

        for(int num : arr){

            if(store.containsKey(num)){

                store.put(num,store.get(num) + 1);

            }else{

                store.put(num,1);

            }

        }

        System.out.println(store);

    }
}
