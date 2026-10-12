import java.util.ArrayList;
import java.util.Arrays;

public class Test39 {

    public static int[][] merge(int[][] intervals){

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 1; i < intervals.length; i++){

            int currentstart = intervals[i][0];
            int currentend = intervals[i][1];

            if(end >= currentstart){

                end = Math.max(end,currentend);

            }else{

                result.add(new int[]{start,end});

                start = currentstart;
                end = currentend;


            }
        }

        result.add(new int[]{start,end});

        return result.toArray(new int[result.size()][]);

    }


    public static void main(String[] args){

        int[][] intervals = {{1,3},{2,6},{8,10},{9,12}};

        int[][] result = merge(intervals);

        for(int[] interval : result){

            System.out.println("[" +interval[0] + "," + interval[1] + "]");

        }
    }
}