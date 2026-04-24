import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要加密的整数：");
        int num1 = scanner.nextInt();
        int num2 = (int) ((num1 * 10 + 5) / 2 + 3.14159);
        System.out.println("加密之后的数为：" + num2);
    }
}
