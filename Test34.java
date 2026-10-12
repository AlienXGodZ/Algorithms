import java.util.Arrays;
import java.util.Stack;

public class Test34 {
    public static void main(String[] args){

        int[] temperature = {73,74,75,71,69,72,76,73};

        int[] days = new int[temperature.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = temperature.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && temperature[stack.peek()] <= temperature[i]){

                stack.pop();

            }

            if(stack.isEmpty()){

                days[i] = 0;

            }else{

                days[i] = stack.peek() - i;

            }

            stack.push(i);

        }

        System.out.println(Arrays.toString(days));

    }
}
