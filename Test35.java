import java.util.Arrays;

public class Test35 {
    public static void main(String[] args){

        int[] start = {1, 2, 3, 0, 5, 8};

        int[] end =  {3, 4, 5, 7, 8, 9};

        int count = 1;

        int lastend = end[0];

        System.out.println("Selected Activity: 0");

        for(int i = 1; i < start.length; i++){

            if(start[i] >= lastend){

                count++;

                lastend = end[i];

                System.out.println("Selected Activity: " + i);


            }
        }

        System.out.println("Total Activity: " + count);

    }
}
