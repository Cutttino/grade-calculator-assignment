import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade:");

        try {
            int grade = scanner.nextInt();

            System.out.println("Grade: " + grade);

            if (grade >= 90) {
                System.out.println("Letter Grade: A");
            } else if (grade >= 80) {
                System.out.println("Letter Grade: B");
            } else if (grade >= 70) {
                System.out.println("Letter Grade: C");
            } else if (grade >= 60) {
                System.out.println("Letter Grade: D");
            } else
                System.out.println("Letter Grade: F");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a whole number for the grade.");
        }
       finally {
            scanner.close();
        }
    }
}
















































