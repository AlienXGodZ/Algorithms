import java.util.ArrayList;
import java.util.List;

public class Test54{

    public static void parition(String s){

        ArrayList<List<String>> result = new ArrayList<>();

        ArrayList<String> current = new ArrayList<>();

        backtrack(result,current,0,s);

        for(List<String> result1: result){

            System.out.println(result1);

        }

    }

    public static void backtrack(ArrayList<List<String>> result, ArrayList<String> current, int index, String s) {

        if (index == s.length()) {

            result.add(new ArrayList<>(current));

            return;

        }

        for (int end = index; end < s.length(); end++) {

            if (palindrome(s, index, end)) {

                current.add(s.substring(index, end + 1));

                backtrack(result, current, end + 1, s);

                current.remove(current.size() - 1);

            }

        }
    }

    public static boolean palindrome(String s,int left,int right) {

        while(left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                return false;

            }

            left++;
            right--;
        }

        return true;


    }


    public static void main(String[] args){

        String s = "aab";

        parition(s);

    }
}