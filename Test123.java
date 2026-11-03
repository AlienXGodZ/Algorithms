public class Test123 {
    public static void main(String[] args){

        int n = 10;
        int i = 1;

        if((n & (1 << i)) == 0){

            System.out.println("Bit is not Set(0)");

        }else{

            System.out.println("Bit is Set(1)");

        }

    }
}
