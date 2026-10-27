import java.util.ArrayList;

public class Test57{

    public static ArrayList<String> restoreipaddress(String s){

        ArrayList<String> store = new ArrayList<>();

        backtrack(store,0,0,s,new ArrayList<>());

        return store;

    }

    public static void backtrack(ArrayList<String> store,int part,int index,String s,ArrayList<String> current) {

        if (part == 4 && index == s.length()) {

            store.add(String.join(",", current));

            return;

        }

        if (part == 4 || index == s.length()) {

            return;

        }

        for (int i = 1; i <= 3; i++) {

            if (index + i > s.length()) {

                break;

            }

            String letters = s.substring(index,
                    index + i);

            if (letters.length() > 1 && letters.charAt(0) == '0') {

                continue;

            }

            int number = Integer.parseInt(letters);

            if (number > 255) {

                continue;

            }

            current.add(letters);

            backtrack(store, part + 1, index + i, s, current);

            current.remove(current.size() - 1);

        }
    }


    public static void main(String[] args){

        String s = "25525511135";

        ArrayList<String> result = restoreipaddress(s);

        for(String ip : result){

            System.out.println(ip);

        }

    }
}