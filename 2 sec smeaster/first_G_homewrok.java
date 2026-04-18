
public class first_G_homewrok {
    public static void main(String[] args) {
        int[] numbers = { 32, 54, 3, 23, 4, 12, 22, 7, 11, 17 };

        System.out.println("Prime numbers in the array:");

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean isPrime = true;

            // Numbers less than 2 are not prime
            if (num < 2) {
                isPrime = false;
            } else {
                // Check if num is divisible by any number from 2 to num-1
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break; // No need to check further
                    }
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
