import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test55{

    public static ArrayList<ArrayList<Integer>> combinationsum(int[] candidated,int target){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        ArrayList<Integer> current = new ArrayList<>();

        Arrays.sort(candidated);

        backtrack(result,current,candidated,target,0);

        return result;



    }

    public static void backtrack(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> current,int[] candidated,int target,int start){

        if(target == 0){

            result.add(new ArrayList<>(current));

            return;

        }

        for(int i = start; i < candidated.length; i++){

            if(i > start && candidated[i] == candidated[i - 1]){

                continue;

            }


            if(candidated[i] > target){

                break;

            }

            current.add(candidated[i]);

            backtrack(result,current,candidated,target - candidated[i],i + 1);


            current.remove(current.size()-1);


        }




    }


    public static void main(String[] args){

        int[] candidates = {10,1,2,7,6,1,5};

        int target = 8;

        ArrayList<ArrayList<Integer>> result = combinationsum(candidates,target);

        for(ArrayList<Integer> results : result){

            System.out.println(results);

        }

    }
}