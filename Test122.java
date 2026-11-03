public class Test122 {
    public static void main(String[] args){

        int[] numbers = {2, 3, 4, 5, 6, 7};

        for(int number : numbers){

            if((number & 1) == 1){

                System.out.println(number + " Odd Number");

            }else{

                System.out.println(number + " Even Number");

            }


        }


    }
}
