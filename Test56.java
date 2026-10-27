import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test56{

    public static ArrayList<ArrayList<Integer>> permuteunique(int[] nums){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(result,used,new ArrayList<>(),nums);

        return result;

    }

    public static void backtrack(ArrayList<ArrayList<Integer>> result,boolean[] used,ArrayList<Integer> store,int[] nums){

        if(store.size() == nums.length){

            result.add(new ArrayList<>(store));

            return;

        }

        for(int i = 0; i < nums.length; i++){

            if(used[i]){

                continue;

            }

            if(i > 0 && nums[i] == nums[i-1] && !used[i - 1]) {

                continue;

            }

            used[i] = true;

            store.add(nums[i]);

            backtrack(result,used,store,nums);

            store.remove(store.size()-1);

            used[i] =false;

            }

        }


    public static void main(String[] args){

        int[] nums = {1, 1, 2};

        ArrayList<ArrayList<Integer>> store = permuteunique(nums);

        for(List<Integer> stores : store){

            System.out.println(stores);

        }
    }
}