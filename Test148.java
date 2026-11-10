import java.util.Scanner;

public class Test148 {
    public static void main(String[] args) {

        Scanner store = new Scanner(System.in);

        System.out.println("Enter the Year:");
        int year = store.nextInt();

        if (year % 400 == 0) {

            System.out.println("Leap Year");

        } else if (year % 100 == 0) {

            System.out.println("Not a Leap Year");

        } else if (year % 4 == 0) {

            System.out.println("Leap Year");

        }

    }

    }

