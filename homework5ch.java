//*********************** 1) Write down a Java program to calculate the power of a number using for loop.

import java.util.Scanner;

public class homework5ch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter base and exponent: ");

        double b = s.nextDouble();
        int e = s.nextInt();
        double r = 1;

        for (int i = 0; i < Math.abs(e); i++) {
            r *= b;
        }
        if (e < 0) {
            r = 1 / r;
        }

        System.out.println(b + "^" + e + " = " + r);
        s.close();
    }
}



// ***********************2) Write down a Java program to check if a number is
// prime or not.

// import java.util.Scanner;

// public class homework5ch {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter a positive integer: ");
// int number = scanner.nextInt();

// // Check for valid input
// if (number <= 1) {
// System.out.println(number + " is NOT a prime number.");
// } else if (number == 2) {
// System.out.println(number + " is a prime number.");
// } else {
// boolean isPrime = true;

// // Check divisibility from 2 to square root of number
// for (int i = 2; i <= Math.sqrt(number); i++) {
// if (number % i == 0) {
// isPrime = false;
// break; // No need to check further
// }
// }

// if (isPrime) {
// System.out.println(number + " is a prime number.");
// } else {
// System.out.println(number + " is NOT a prime number.");
// }
// }

// scanner.close();
// }
// }

// ********************* 3) Write down a Java program to print the following
// shape:

// public class homework5ch {
// public static void main(String[] args) {
// int i, j;
// for (i = 1; i <= 8; i++) {
// for (j = 1; j <= i; j++) {
// System.out.print("*" + " ");
// }
// System.out.println();
// }
// }

// }
