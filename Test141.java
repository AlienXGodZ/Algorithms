public class Test141{
    public static void main(String[] args){

        int base = 2;
        int exponent = 10;

        int result = 1;

        while(exponent > 0){

            if(exponent % 2 == 1){

                result = result * base;

            }

            base = base * base;

            exponent = exponent / 2;

        }

        System.out.println(result);

    }
}