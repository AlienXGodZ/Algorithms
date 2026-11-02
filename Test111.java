public class Test111 {

    public static int change(int[] coins, int index, int amount) {

        if (amount == 0) {
            return 1;
        }

        if (index == coins.length) {
            return 0;
        }

        // SKIP current coin
        int skip = change(coins, index + 1, amount);

        // TAKE current coin
        int take = 0;

        if (coins[index] <= amount) {
            take = change(coins, index, amount - coins[index]);
        }

        return take + skip;
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 5;

        System.out.println(change(coins, 0, amount));
    }
}