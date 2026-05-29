
/// second semester homework
/// 
/// 
/// 
///
/// 
/// first exercise
import java.util.Scanner;

public class first_G_homewrok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // طلب حجم المصفوفة من المستخدم
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        // إنشاء المصفوفة بالحجم المطلوب
        int[] numbers = new int[size];

        // قراءة عناصر المصفوفة من المستخدم
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // طلب الرقم المطلوب البحث عنه
        System.out.print("Enter the number to count: ");
        int target = input.nextInt();

        // حساب عدد مرات التكرار
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " appears " + count + " times");
        input.close();
    }
}

///
///
///
///
/// second exercise

import java.util.Scanner;

public class first_G_homewrok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // طلب حجم المصفوفة
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        // إنشاء المصفوفة
        int[] numbers = new int[size];

        // قراءة العناصر
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // إيجاد وطباعة الأعداد الأولية
        System.out.println("\nPrime numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
        input.close();
    }
}

//third exercise 
import java.util.Scanner;

public class first_G_homewrok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // طلب حجم المصفوفة
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        // إنشاء المصفوفة
        int[] numbers = new int[size];

        // قراءة العناصر
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // ترتيب تنازلي (من الأكبر إلى الأصغر)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // طباعة النتيجة
        System.out.println("\nArray in descending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        input.close();
    }
}



//four exercise 
import java.util.Scanner;

public class first_G_homewrok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // طلب عدد الأسماء
        System.out.print("Enter the number of names: ");
        int size = input.nextInt();
        input.nextLine(); // تنظيف المخزن المؤقت

        // إنشاء المصفوفة
        String[] names = new String[size];

        // قراءة الأسماء
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // ترتيب الأسماء أبجدياً
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // طباعة النتيجة
        System.out.println("\nNames in alphabetical order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        input.close();
    }
}




