import java.util.Arrays;
import java.util.Stack;

public class Test30 {
    public static void main(String[] args){

        int[] arr = {4, 5, 2, 10, 8};

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length - 1; i >= 0 ; i--){

            while(!stack.isEmpty() && stack.peek() >= arr[i]){

                stack.pop();

            }

            if(stack.isEmpty()){

                result[i] = -1;

            }else{

                result[i] = stack.peek();

            }

            stack.push(arr[i]);

        }

        System.out.println(Arrays.toString(result));

    }
}
