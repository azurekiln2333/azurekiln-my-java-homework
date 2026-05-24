import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int lastDigit = number % 10;
        int sum = firstDigit + secondDigit + lastDigit;
        System.out.println("The sum of the digits is " + sum);
    }
}
