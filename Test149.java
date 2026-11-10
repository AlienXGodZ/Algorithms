import java.util.Scanner;

public class Test149 {
    public static void main(String[] args){

        Scanner store = new Scanner(System.in);

        System.out.println("Enter Principle(Amount): ");
        int p = store.nextInt();

        System.out.println("Enter Rate(Interest): 1");
        int r = store.nextInt();

        System.out.println("Enter Year: ");
        int t = store.nextInt();

        double si = (p * r * t) / 100;

        System.out.println(si);

    }
}
