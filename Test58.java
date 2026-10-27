public class Test58{

    public static boolean partitateksubsets(int[] nums,int k){

        int total = 0;

        for(int num : nums){

            total += num;

        }

        if(total%k != 0){

            return false;

        }

        int target = total / k;

        boolean[] visited = new boolean[nums.length];

        boolean answer = backtrack(nums,k,target,0,0,visited);

        return answer;


    }

    public static boolean backtrack(int[] nums,int k,int target,int start,int current,boolean[] visited){

        if(k == 1){

            return true;

        }

        if(current == target){

            return backtrack(nums,k - 1,target,0,0,visited);

        }

        for(int i = start; i < nums.length; i++){

            if(visited[i]){

                continue;
            }

            if(current + nums[i] > target){

                continue;

            }

            visited[i] = true;

            if(backtrack(nums,k,target,i+1,current + nums[i],visited)){

                return true;

            }

            visited[i] = false;

        }

        return false;

    }


    public static void main(String[] args){

        int[] nums = {4, 3, 2, 3, 5, 2, 1};

        int k = 4;

        System.out.println(partitateksubsets(nums,k));



    }
}