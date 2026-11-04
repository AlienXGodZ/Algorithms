public class Test131{
    public static void main(String[] args){

        int a = 12;
        int b = 18;

        int gcd = 0;

        for(int i = Math.min(a,b); i >= 1; i--){

            if(a % i == 0 && b % i == 0){

                gcd = i;
                break;

            }

        }

        System.out.println(gcd);

    }

}