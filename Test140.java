public class Test140 {
    public static void main(String[] args){

        int n = 36;

        for(int i = 1; i * i <= n; i++){

            System.out.print(i + "\t");

            if(i != n / i){

                System.out.print(n / i + "\t");

            }

        }

    }
}
