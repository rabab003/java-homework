
import java.util.Scanner;

public class fourth {

    // the first exercise
    // (method that takes a string as input
    // and print it out.)

    // public static void main(String[] args) {

    // Scanner input = new Scanner(System.in);

    // System.out.print("Enter a string: ");
    // String text = input.nextLine();

    // printText(text);

    // input.close();
    // }

    // public static void printText(String str) {
    // System.out.println("You entered: " + str);

    // }










    // the second exercise: 
    // a method that takes a double number as
    // input and check whether it positive or negative.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double num = input.nextDouble();

        checkPositiveNegative(num);

        input.close();
    }

    public static void checkPositiveNegative(double x) {
        if (x > 0) {
            System.out.println(x + " is positive");
        } else if (x < 0) {
            System.out.println(x + " is negative");
        } else {
            System.out.println(x + " is zero");
        }
    }

}
