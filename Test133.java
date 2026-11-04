public class Test133 {
    public static void main(String[] args){

        int a = 4;
        int b = 6;

        int lcm = Math.max(a,b);

        while(true){

            if(lcm % a == 0 && lcm % b == 0){

                break;

            }

            lcm++;


        }

        System.out.println(lcm);

    }
}
