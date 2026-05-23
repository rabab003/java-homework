import java.util.Scanner;

public class fivth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // a) مضاعفة الرقم
        System.out.print("Enter a number to double: ");
        double num = input.nextDouble();
        System.out.println("Double is: " + doubleValue(num));
        
        // b) التحقق من الزوجي
        System.out.print("\nEnter an integer to check even: ");
        int num2 = input.nextInt();
        System.out.println("Is even? " + isEven(num2));
        
        // c) تحويل حرف إلى uppercase
        input.nextLine(); // تنظيف المخزن
        System.out.print("\nEnter a lowercase letter: ");
        char letter = input.nextLine().charAt(0);
        System.out.println("Uppercase: " + toUpperCase(letter));
        
        input.close();
    }
    
    // a) دالة مضاعفة الرقم
    public static double doubleValue(double x) {
        return x * 2;
    }
    
    // b) دالة التحقق من الزوجي
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
    
    // c) دالة تحويل lowercase إلى uppercase
    public static char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }
}