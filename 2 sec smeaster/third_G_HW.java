


/// first التمرين الأول: ضرب مصفوفتين (Matrix Multiplication)

import java.util.Scanner;

public class third_G_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // قراءة حجم المصفوفة الأولى
        System.out.print("Enter rows of matrix A: ");
        int r1 = input.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int c1 = input.nextInt();
        
        // قراءة حجم المصفوفة الثانية
        System.out.print("Enter rows of matrix B: ");
        int r2 = input.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int c2 = input.nextInt();
        
        // التحقق من إمكانية الضرب
        if (c1 != r2) {
            System.out.println("Cannot multiply! Columns of A must equal rows of B.");
            return;
        }
        
        // إنشاء المصفوفات
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];
        
        // قراءة عناصر المصفوفة A
        System.out.println("\nEnter elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        
        // قراءة عناصر المصفوفة B
        System.out.println("\nEnter elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        
        // ضرب المصفوفات
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // طباعة النتيجة
        System.out.println("\nMultiplication Result:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}




// التمرين الثاني: طباعة مؤشرات الأعداد الزوجية

import java.util.Scanner;

public class third_G_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nIndexes of even numbers (row, col):");
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println("(" + i + "," + j + ") = " + arr[i][j]);
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("No even numbers found.");
        }
        
        input.close();
    }
}



//التمرين الثالث: مضاعفة قيمة كل عنصر
import java.util.Scanner;

public class third_G_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nOriginal array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // مضاعفة كل قيمة
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = arr[i][j] * 2;
            }
        }
        
        System.out.println("\nArray after doubling:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}



//التمرين الرابع: عكس كل صف في المصفوفة


import java.util.Scanner;

public class third_G_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nOriginal array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // عكس كل صف
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1 - j] = temp;
            }
        }
        
        System.out.println("\nArray after reversal:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}









