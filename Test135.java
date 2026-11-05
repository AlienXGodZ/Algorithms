public class Test135 {

    public static int gcd(int a,int b){

        if(b == 0){

            return a;

        }

        return gcd(b,a % b);

    }


    public static void main(String[] args){

       System.out.println(gcd(72,30));


    }
}
