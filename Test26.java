import java.util.Arrays;
import java.util.Stack;

public class Test26{
    public static void main(String[] args){

        int[] arr = {4, 5, 2, 10, 8};
        int[] result = new int[arr.length];

        Stack<Integer> store = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){

            while(!store.isEmpty() && store.peek() <= arr[i]){

               store.pop();

            }

            if(store.isEmpty()){

                result[i] = -1;

            }else{

                result[i] = store.peek();

            }

            store.push(arr[i]);

        }

        System.out.println(Arrays.toString(result));


    }
}