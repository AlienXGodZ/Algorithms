import java.util.Arrays;

public class Test38{

    public static int findplatform(int[] arrival,int[] departure){

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;

        int i = 0;
        int j = 0;

        int platform = 0;
        int maxplatform = 0;


        while(i < n && j < n){

            if(arrival[i] <= departure[j]){

                platform++;

                maxplatform = Math.max(maxplatform,platform);

                i++;

            }else{

                platform--;
                j++;

            }

        }

        return maxplatform;

    }

    public static void main(String[] args){


        int[] arrival = {900, 940, 950, 1100, 1500, 1800};

        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findplatform(arrival,departure);

        System.out.println("Maximum Platform: " + result);

    }

}