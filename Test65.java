public class Test65 {
    public static void main(String[] args){

        int[] height = {10, 30, 20, 40};

        int n = height.length;

        int prev1 = 0;
        int prev2 = 0;

        for(int i = 1; i < n; i++){

            int onestep = prev1 + Math.abs(height[i] -height[i - 1]);

            int twostep = Integer.MAX_VALUE;

            if(i > 1){

                twostep = prev2 + Math.abs(height[i] - height[i - 2]);

            }

            int current = Math.min(onestep,twostep);

           prev2 = prev1;
           prev1 = current;


        }

        System.out.println("Minimum energy:" + prev1);



    }
}
