
/// second semester homework
/// 
/// 
/// 
///
/// 
/// first exercise
//التمرين الأول: حساب عدد مرات تكرار عنصر في مصفوفة //2D

import java.util.Scanner;

public class sec_G_homeworks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.print("Enter element to count: ");
        int target = input.nextInt();
        
        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] == target) {
                    count++;
                }
            }
        }
        
        System.out.println("Occurrences: " + count);
        input.close();
    }
}

// // the second التمرين الثاني: طباعة الأعداد السالبة في مصفوفة 2D


import java.util.Scanner;

public class sec_G_homeworks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nNegative numbers:");
        boolean found = false;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] < 0) {
                    System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                    found = true;
                }
            }
        }
        
        if(!found) {
            System.out.println("No negative numbers found.");
        }
        
        input.close();
    }
}





/// the third  التمرين الثالث: طباعة قطري المصفوفة
import java.util.Scanner;

public class sec_G_homeworks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();
        
        int[][] arr = new int[n][n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        
        // طباعة المصفوفة الأصلية
        System.out.println("\nOriginal matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        // القطر الرئيسي (i == j)
        System.out.print("\nPrincipal diagonal (i==j): ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        
        // القطر الثانوي (i + j == n - 1)
        System.out.print("\nSecondary diagonal (i+j=" + (n-1) + "): ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i][n-1-i] + " ");
        }
        
        input.close();
    }
}
