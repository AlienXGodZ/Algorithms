import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test24 {
    public static void main(String[] args){

        String words = "aabccdeff";

        HashMap<Character,Integer> store = new HashMap<>();

        for(int i = 0; i < words.length(); i++){

            char j = words.charAt(i);

            if(store.containsKey(j)){

                store.put(j,store.get(j) + 1);

            }else{

                store.put(j,1);

            }


        }

        int count = 0;

        for(Map.Entry<Character,Integer> ultrastore : store.entrySet()){

            if(ultrastore.getValue() == 1){

                System.out.println("single chararacter is: " + ultrastore.getKey());
                count++;

            }


        }

        if(count == 0){

            System.out.println("There is no single character in the String");

        }

    }
}
