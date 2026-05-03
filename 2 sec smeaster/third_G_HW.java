// public class third_G_HW {
//     public static void main(String[] args) {
//         int[][] A = {{1, 2}, {3, 4}};
//         int[][] B = {{2, 0}, {1, 2}};
//         int[][] result = new int[2][2];
        
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 for (int k = 0; k < 2; k++) {
//                     result[i][j] += A[i][k] * B[k][j];
//                 }
//             }
//         }
        
//         System.out.println("Multiplication Result:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

// }


// public class third_G_HW {
//     public static void main(String[] args) {
//         int[][] arr = {{12, 30, 15}, {-4, 7, 8}, {3, 6, 9}};
        
//         System.out.println("Indexes of even numbers (row, col):");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] % 2 == 0) {
//                     System.out.println("(" + i + "," + j + ") = " + arr[i][j]);
//                 }
//             }
//         }
//     }
// }



// public class Q3_DoubleValues {
//     public static void main(String[] args) {
//         int[][] arr = {{12, 30, 15}, {-4, 7, 8}, {3, 6, 9}};
        
//         System.out.println("Original array:");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         // Double each value
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = arr[i][j] * 2;
//             }
//         }
        
//         System.out.println("\nArray after doubling:");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

public class third_G_HW {
    public static void main(String[] args) {
        int[][] arr = {{12, 30, 15}, {-4, 7, 8}, {3, 6, 9}};
        
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - 1 - j];
                arr[i][arr[i].length - 1 - j] = temp;
            }
        }
        
        System.out.println("\nArray after reversal:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}