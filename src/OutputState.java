import java.util.Scanner;

public class OutputState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String s = input.nextLine();
        char majorChar = s.toUpperCase().charAt(0);
        char yearChar = s.charAt(1);

        String major = switch (majorChar) {
            case 'I' -> "Information Management";
            case 'C' -> "Computer Science";
            case 'A' -> "Accounting";
            default -> "Unknown";
        };
        String year = switch (yearChar) {
            case '1' -> "Freshman";
            case '2' -> "Sophomore";
            case '3' -> "Junior";
            case '4' -> "Senior";
            default -> "Unknown";
        };
        System.out.println(major + " " + year);
    }
}
