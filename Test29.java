import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test29{

    public static List<List<String>> groupanagram (String[] words){

        HashMap<String,List<String>> map = new HashMap<>();

        for(String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {

                map.put(key, new ArrayList<>());

            }

                map.get(key).add(word);

        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args){

        String[] words = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> anagram = groupanagram(words);

        System.out.println(anagram);







    }
}