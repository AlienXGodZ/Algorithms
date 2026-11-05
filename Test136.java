public class Test136 {
    public static void main(String[] args) {

        int n = 2;

        boolean condition = true;

        if (n <= 1) {

            condition = false;

        } else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {

                    condition = false;

                    break;

                }

            }


        }

        if(condition){

            System.out.println("Prime Number");

        }else{

            System.out.println("Not a Prime Number");

        }
    }

}