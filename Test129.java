public class Test129 {
    public static void main(String[] args){

        int[] arr = {2, 3, 5, 3, 2};

        int result = 0;

        for(int arrs : arr){

            result = result ^ arrs;

        }

        System.out.println(result);

    }
}
