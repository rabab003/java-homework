
/// second semester homework
/// 
/// 
/// 
///
/// 
/// first exercise
// import java.util.Scanner;

// public class first_G_homewrok {
//     public static void main(String[] args) {

//         int[] numbers = { 32, 54, 3, 23, 4, 12, 22, 3, 54, 3 };
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the number to count: ");
//         int target = input.nextInt();

//         int count = 0;

//         // Count occurrences
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == target) {
//                 count++;
//             }
//         }

//         System.out.println("The number " + target + " appears " + count + " times");

//     }
// }

///
///
///
///
/// second exercise
// public class first_G_homewrok {
// public static void main(String[] args) {
// int[] numbers = { 32, 54, 3, 23, 4, 12, 22, 7, 11, 17 };

// System.out.println("Prime numbers in the array:");

// for (int i = 0; i < numbers.length; i++) {
// int num = numbers[i];
// boolean isPrime = true;

// // Numbers less than 2 are not prime
// if (num < 2) {
// isPrime = false;
// } else {
// // Check if num is divisible by any number from 2 to num-1
// for (int j = 2; j < num; j++) {
// if (num % j == 0) {
// isPrime = false;
// break; // No need to check further
// }
// }
// }

// if (isPrime) {
// System.out.println(num);
// }
// }
// }
// }
// the third exercise
// import java.util.Scanner;

// public class first_G_homewrok {
//     public static void main(String[] args) {
//         int[] numbers = { 32, 54, 3, 23, 4, 12, 22 };

//         // Sort in descending order (largest to smallest)
//         for (int i = 0; i < numbers.length - 1; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[j] > numbers[i]) { // Changed: > instead of <
//                     int temp = numbers[i];
//                     numbers[i] = numbers[j];
//                     numbers[j] = temp;
//                 }
//             }
//         }

//         System.out.println("Array in descending order:");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }

//     }
// }

// forth exercise 

public class first_G_homewrok {
    public static void main(String[] args) {
        String[] names = { "John", "Alice", "Bob", "David", "Charlie" };

        // Sort names alphabetically
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                // compareTo() returns negative if names[j] comes before names[i]
                if (names[j].compareTo(names[i]) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
