import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== 简易计算器 =====");
            System.out.println("1. 加法 (+)");
            System.out.println("2. 减法 (-)");
            System.out.println("3. 乘法 ()");
            System.out.println("4. 除法 (/)");
            System.out.println("5. 求余 (%)");
            System.out.println("6. 乘方 (^)");
            System.out.println("88. 退出");
            System.out.print("请选择：");

            int choice = sc.nextInt();

            if (choice == 88) {
                System.out.println("感谢使用，再见！");
                break;
            }
            // 输入两个操作数
            System.out.print("请输入第一个数：");
            double num1 = sc.nextDouble();

            System.out.print("请输入第二个数：");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.printf("结果：%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                    break;

                case 2:
                    System.out.printf("结果：%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                    break;

                case 3:
                    System.out.printf("结果：%.2f %.2f = %.2f%n", num1, num2, num1 * num2);
                    break;

                case 4:
                    if (Math.abs(num2) < 1e-10) {
                        System.out.println("错误：除数不能为0！");
                    } else {
                        System.out.printf("结果：%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                    }
                    break;

                case 5:
                    if (Math.abs(num2) < 1e-10) {
                        System.out.println("错误：求余运算除数不能为0！");
                    } else {
                        System.out.printf("结果：%.2f %% %.2f = %.2f%n", num1, num2, num1 % num2);
                    }
                    break;

                case 6:
                    double result = Math.pow(num1, num2);
                    if (Double.isInfinite(result)) {
                        System.out.println("错误：计算结果超出范围或出现数学非法操作（如0的负次方）！");
                    } else if (Double.isNaN(result)) {
                        System.out.println("错误：无效的计算（如负数的非整数次方）！");
                    } else {
                        System.out.printf("结果：%.2f ^ %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
                default:
                    System.out.println("无效选择，请重新输入！");

            }

        }
    }
}
