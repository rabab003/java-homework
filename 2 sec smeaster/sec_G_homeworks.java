
/// second semester homework
/// 
/// 
/// 
///
/// 
/// first exercise
import java.util.Scanner;




// //the first exercise
// public class sec_G_homeworks {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter number of rows: ");
//         int rows = input.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = input.nextInt();
        
//         int[][] arr = new int[rows][cols];
        
//         System.out.println("Enter array elements:");
//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 arr[i][j] = input.nextInt();
//             }
//         }
        
//         System.out.print("Enter element to count: ");
//         int target = input.nextInt();
        
//         int count = 0;
//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 if(arr[i][j] == target) {
//                     count++;
//                 }
//             }
//         }
        
//         System.out.println("Occurrences: " + count);
//         input.close();
//     }
// }



// second exercise

// public class sec_G_homeworks {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter number of rows: ");
//         int rows = input.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = input.nextInt();
        
//         int[][] arr = new int[rows][cols];
        
//         System.out.println("Enter array elements:");
//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 arr[i][j] = input.nextInt();
//             }
//         }
        
//         System.out.println("Negative numbers:");
//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 if(arr[i][j] < 0) {
//                     System.out.print(arr[i][j] + " ");
//                 }
//             }
//         }
        
//         input.close();
//     }
// }




// third exercise 

public class sec_G_homeworks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();
        
        int[][] arr = new int[n][n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Principal diagonal (i==j):");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.print(arr[i][i] + " ");
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i + j == n - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        
        input.close();
    }
}



