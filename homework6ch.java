// Homework 6 Chapter 


/************************** Problem 1 *******/
// import java.util.Scanner;

// public class homework6ch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         int count = 1;
//         double total = 0;
        
//         System.out.println("Enter 5 grades:");
        
//         while (count <= 5) {
//             System.out.print("Grade " + count + ": ");
//             double grade = input.nextDouble();
//             total = total + grade;
//             count++;
//         }
        
//         double average = total / 5;

//         System.out.println("Average grade: " + average);
        
//         input.close();
//     }
// }


/************************** Problem 2 *******/
import java.util.Scanner;

public class homework6ch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculating: X = 2! + 4! + 6! + ... + 12!");
        
        int X = 0;
        int num = 2;  // Start from 2
        
        // Outer while for even numbers: 2, 4, 6, ..., 12
        while (num <= 12) {
            int fact = 1;
            int i = 1;
            
            // Inner while for factorial calculation
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            
            System.out.println(num + "! = " + fact);
            X = X + fact;
            num = num + 2;  // Go to next even number
        }
        
        System.out.println("Final result X = " + X);
        scanner.close();
    }
}