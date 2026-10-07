public class Test12 {
    public static void main(String[] args){

        String palindrome = "alla";

        int left = 0;
        int right = palindrome.length() - 1;

        while(left < right){

            if(palindrome.charAt(left) != palindrome.charAt(right)){

                System.out.println("Not palindrome");

                return;

            }

            left++;
            right--;


        }

        System.out.println("Palindrome");





    }
}
