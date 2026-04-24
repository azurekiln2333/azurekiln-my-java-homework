import java.util.Scanner;

public class ASCIIQuery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter characters to query ASCII: ");
        String s = input.nextLine();

        if (!s.isEmpty()) {
            char ch = s.charAt(0);
            int ascii = (int) ch;

            System.out.println("The ASCII code for character " + ch + " is " + ascii);
        } else {
            System.out.println("未输入任何字符。");
        }
    }
}
