public class Test132 {
    public static void main(String[] args){

        int a = 12;
        int b = 18;

        while(b != 0){

            int result = a % b;

            a = b;
            b = result;


        }

        System.out.println(a);

    }
}
