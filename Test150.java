import java.util.Scanner;

public class Test150 {
    public static void main(String[] args){

        Scanner store = new Scanner(System.in);

        System.out.println("Enter Principle(Amount):");
        int p = store.nextInt();

        System.out.println("Enter Rate:");
        int r = store.nextInt();

        System.out.println("Enter year");
        int t = store.nextInt();

        double amount = p * Math.pow(1 + r / 100.0,t);

        double ci = amount - p;

        System.out.println("Amount" + amount);
        System.out.println("Compount Interest:" + ci);



    }
}
