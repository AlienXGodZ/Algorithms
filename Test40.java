import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test40{

    public static int[][] merge(int[][] intervals,int[] newintervals){

        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while(i < n && intervals[i][1] < newintervals[0]){

            result.add(intervals[i]);

            i++;
        }

        while(i < n && intervals[i][0] <= newintervals[0]){

            newintervals[0] = Math.min(intervals[i][0],newintervals[0]);

            newintervals[1] = Math.max(intervals[i][1],newintervals[1]);

            i++;

        }

        result.add(newintervals);

        while(i < n){

            result.add(intervals[i]);
            i++;

        }

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args){

        int[][] intervals = {{1,3},{6,9}};

        int[] newintervals = {2,5};

        int[][] result = merge(intervals,newintervals);

        for(int[] results : result){

            System.out.print("[ ");

            for(int res : results){

                System.out.print(res + " ");

            }

            System.out.print("]");

            System.out.println();

        }



    }
}