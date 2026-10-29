public class Test67 {
    public static void main(String[] args){

        int[] money = {3, 8, 4, 10};

        int n = money.length;

        if(n == 1){

            System.out.println(money[0]);
            return;

        }

        int prev1 = money[0];
        int prev2 = Math.max(money[0],money[1]);

        for(int i = 2; i < n; i++){

            int current = Math.max(prev2,money[i] + prev1);

            prev2 = prev1;
            prev1 = current;

        }

        System.out.println("Maximum Money: " + prev1);

    }
}
