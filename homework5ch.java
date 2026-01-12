// ***********************1) Write down a Java program to calculate the power of a

// import java.util.Scanner;

// public class homework5ch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         // Get the inputs number from user
//         System.out.print("Enter the base number: ");
//         int base = input.nextInt();
        
//         System.out.print("Enter the exponent: ");
//         int exponent = input.nextInt();
        
//         // Initialize result to 1 (x⁰ = 1 for any x)
//         int result = 1;
        
//         // Calculate power using for loop
//         for (int i = 0; i < exponent; i++) {
//             result = result * base;
//         }
        
        
//         // Display the result
//         System.out.println("the result is " + result);
        
//         input.close();
//     }
// }




// ***********************2) Write down a Java program to check if a number is
// prime or not.

// import java.util.Scanner;

// public class homework5ch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int n = input.nextInt();
        
//         boolean prime = true;
        
      
//             for (int i = 2; i < n; i++) {
//                 if (n % i == 0) {
//                     prime = false;
//                     break;
//                 }
//             }
        
        
//         System.out.println(n + " is " + (prime ? "prime" : "not prime"));
//         input.close();
//     }
// }



// ********************* 3) Write down a Java program to print the following shape:

public class homework5ch {
public static void main(String[] args) {
int i, j;
for (i = 1; i <= 8; i++) {
for (j = 1; j <= i; j++) {
System.out.print("*" + " ");
}
System.out.println();
}
}

}
