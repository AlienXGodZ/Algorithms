public class Test69 {
    public static void main(String[] args){

        int[] a = {6, 4, 9};

        int n = a.length;

        int prev2 = a[0];
        int prev1 = Math.max(a[0],a[1]);

        for(int i = 2; i < n; i++){

            int current = Math.max(prev1,a[i] + prev2);

            prev2 = prev1;
            prev1 = current;

        }

        System.out.println("Maximum sum: " + prev1);

    }
}
