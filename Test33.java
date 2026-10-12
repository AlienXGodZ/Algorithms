import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Test33{
    public static void main(String[] args){

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = new int[price.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < price.length; i++){

            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){

                stack.pop();

            }

            if(stack.isEmpty()){

                span[i] = i + 1;

            }else{

                span[i] = i - stack.peek();
            }

            stack.push(i);

        }

        System.out.println(Arrays.toString(span));

    }
}