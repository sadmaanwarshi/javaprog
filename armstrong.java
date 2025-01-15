import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        // Find the number of digits
        int n = Integer.toString(number).length();

        // Calculate the sum of the nth powers of its digits
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        // Check if the sum equals the original number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
