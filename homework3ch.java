// the homeworks of chapter 3


// ############################ the first homework ############################

/* 1) Write down a Java program to find the average of two grads and if the average
greater than or equal 50 then print out the average and "passed".
*/


// import java.util.Scanner;

// public class homework3ch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter your grade: ");

//         int grade1 = input.nextInt();
//         int grade2 = input.nextInt();

//         double avrg = (grade1 + grade2) / 2;

//         if(avrg >= 50){
//             System.out.println("passed");
//         }
//     }

// }


// ############################ the second homework ############################
/* 2) Write down a Java program to check if a number is even or odd.*/


// import java.util.Scanner;

// public class homework3ch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter the number: ");

//         int num1 = input.nextInt();

//         if( num1 % 2 == 0){
//             System.out.println("it even number");
//         } else {
//             System.out.println("it odd number");
//         }
//     }

// }


// ############################ the third homework ############################

import java.util.Scanner;

public class homework3ch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println("number 1 is the largest");
        }else if(num2 > num3){
            System.out.println("number 2 is larger than number 3");
        }
    }


}