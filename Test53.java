import java.util.ArrayList;

public class Test53{

    static String[] phone = {  "",
                               "",
                              "abc",
                              "def",
                              "ghi",
                              "jkl",
                              "mno",
                              "pqrs",
                              "tuv",
                              "wxyz"

    };

    public static void lettercombination(String digits){

        ArrayList<String> result = new ArrayList<>();

        if(digits.length() == 0){

            return;
        }

        backtrack(result,digits,0,"");

        for(String results : result){

            System.out.println(results);

        }

    }

    public static void backtrack(ArrayList<String> result,String digits,int index,String current){


        if(index == digits.length()){

            result.add(current);

            return;

        }

        int digit = digits.charAt(index) - '0';

        String phoneword = phone[digit];

        for(int i = 0; i < phoneword.length(); i++){


            char ch = phoneword.charAt(i);


            backtrack(result,digits,index + 1,current + ch);


        }
    }


    public static void main(String[] args){

        String digits = "23";

        lettercombination(digits);

    }
}