import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, sum = 0, digit;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        System.out.println(originalNum + (sum == originalNum ? " is an Armstrong Number" : " is not an Armstrong Number"));
        scanner.close();
    }
}
