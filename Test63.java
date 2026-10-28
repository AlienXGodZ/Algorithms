public class Test63 {
    public static void main(String[] args){

        int n = 6;

        int prev1 = 1;
        int prev2 = 1;

        for(int i = 2; i <= n; i++){

            int current = prev1 + prev1;

            prev1 = prev2;
            prev2 = current;

        }

        System.out.println("Number of ways: " + prev2);

    }
}
