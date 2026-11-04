public class Test134 {

    public static int gcd(int a,int b){

        while(b != 0){

            int result = a % b;

            a = b;
            b = result;

        }

        return a;

    }


    public static void main(String[] args){

        int a = 12;
        int b = 18;

        int gcdvalue = gcd(a,b);

        int result = (a * b) / gcdvalue;

        System.out.println(result);


    }
}
