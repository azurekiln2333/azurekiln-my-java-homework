import java.util.Scanner;

public class Main3 {
    public static String getDayString(int number) {
        return  switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> "";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day (0-6): ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDay = (today + elapsed) % 7;
        System.out.println("Today is " + getDayString(today) + " and the future day is " + getDayString(futureDay));
    }
}
