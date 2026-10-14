import java.util.ArrayList;
import java.util.Arrays;

public class Test41 {

    public static int[][] eraseoverlapintervals(int[][] intervals,int removed) {

        ArrayList<int[]> result = new ArrayList<>();

        if (intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) ->
                Integer.compare(a[1], b[1]));

        int prevend = intervals[0][1];

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] >= prevend) {
                result.add(intervals[i]);
                prevend = intervals[i][1];
            }else{

                removed++;

            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int removed = 0;

        int[][] intervals = {
                {1, 3}, {2, 4}, {3, 5}, {6, 8}
        };

        int[][] answer = eraseoverlapintervals(intervals,removed);

        for (int[] answers : answer) {
            System.out.println(answers[0] + " " + answers[1]);
        }
    }
}