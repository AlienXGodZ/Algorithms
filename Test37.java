import java.util.Arrays;
import java.util.Comparator;

class Job{
    char id;
    int deadline;
    int profit;

    Job(char id,int deadline,int profit){

        this.id = id;
        this.deadline = deadline;
        this.profit = profit;

    }
}

public class Test37 {

    public static void jobsequence(Job[] jobs) {

        Arrays.sort(jobs, new Comparator<Job>() {

            public int compare(Job s1, Job s2) {
                return Integer.compare(s2.profit, s1.profit);
            }

        });


        int maxdeadline = 0;

        for (Job job : jobs) {

            if (maxdeadline < job.deadline) {

                maxdeadline++;

            }

        }

        boolean[] slot = new boolean[maxdeadline];

        char[] result = new char[maxdeadline];

        int totalprofit = 0;

        for (Job job : jobs) {

            for (int i = job.deadline - 1; i >= 0; i--) {

                if (!slot[i]) {

                    slot[i] = true;

                    result[i] = job.id;

                    totalprofit += job.profit;

                    break;

                }

            }
        }

        System.out.println("Selected Jobs: ");

        for(char c : result){

            if(c != '\0'){

                System.out.print(c + " ");

            }
        }

        System.out.println();

        System.out.println("Maximum Profit: " + totalprofit);

    }


    public static void main(String[] args){

        Job[] jobs = { new Job('A',2,100),
                       new Job('B',1,19),
                       new Job('C',2,27),
                       new Job('D',1,25),
                       new Job('E',3,15)};

        jobsequence(jobs);

    }
}
