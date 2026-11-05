public class Test138{
    public static void main(String[] args){

        int n = 30;

        boolean[] condition = new boolean[n + 1];

        for(int i = 2; i <= n; i++){

            condition[i] = true;

        }

        for(int i = 2; i * i <= n; i++){

            if(condition[i]){

                for(int j = i * i; j <= n; j += i){

                    condition[j] = false;

                }

            }

        }

        System.out.println("The Prime Number From 1 to 30: ");

        for(int i = 2; i <= n; i++){

            if(condition[i]){

                System.out.print(i + "\t");

            }

        }

    }
}