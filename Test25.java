import java.util.HashSet;

public class Test25{
    public static void main(String[] args){

        int[] arr =  {5,100, 4, 200, 1, 3, 2};

        HashSet<Integer> store = new HashSet<>();

        for(int i : arr){

            store.add(i);

        }

        int longest = 0;

        for(int i : store){

            if(!store.contains(i-1)){

                int num = i;
                int length = 1;

                while(store.contains(num + 1)){

                    num++;
                    length++;


                }

                longest = Math.max(longest,length);

            }

        }

        System.out.println("Longest Consecutive means continue length is: " + longest);








    }
}