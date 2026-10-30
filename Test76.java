public class Test76{

    public static int coinchange(int[] coins,int amount){

        if(amount == 0){
            return 0;
        }

        if(amount < 0){

            return Integer.MAX_VALUE;

        }

        int mincoins = Integer.MAX_VALUE;

        for(int coin : coins){

            int result = coinchange(coins,amount - coin);

            if(result != Integer.MAX_VALUE){

                mincoins = Math.min(mincoins,result + 1);

            }

        }

        return mincoins;

    }


    public static void main(String[] args){

        int[] coins = {1, 2, 5};
        int amount = 6;

        int result = coinchange(coins,amount);

        if(result == Integer.MAX_VALUE){

            System.out.println(-1);

        }else{

            System.out.println(result);

        }

    }
}