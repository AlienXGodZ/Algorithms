import java.util.Arrays;
import java.util.HashMap;

public class Test23 {
    public static void main(String[] args){

      int[] arr = {2, 7, 11, 15};

      int target = 9;

      HashMap<Integer,Integer> store = new HashMap<>();

      for(int i = 0; i < arr.length; i++){

          int complement = target - arr[i];

          if(store.containsKey(complement)){

              System.out.println("Found: " + complement + " + " + arr[i]);
              return;

          }else{

              store.put(arr[i],i);

          }

      }

    }
}
