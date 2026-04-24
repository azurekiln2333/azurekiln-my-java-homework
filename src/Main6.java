import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String value = sc.nextLine();
        System.out.println("您当前输入了：" + value);

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (char c : value.toCharArray()) {
            System.out.println(c + "->" + covertChar(c));
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("统计结果如下：");
        System.out.println("大写字母：" + upperCount + " 个");
        System.out.println("小写字母：" + lowerCount + " 个");
        System.out.println("数字字符：" + digitCount + " 个");
        System.out.println("其他字符：" + otherCount + " 个");

        // 密码可视化输出
        System.out.println("\n--- 密码成分分析 ---");
        printStars("大写字母", upperCount);
        printStars("小写字母", lowerCount);
        printStars("数字字符", digitCount);
        printStars("其他字符", otherCount);

        // 生成验证码
        String captcha = generateCaptcha(4);
        System.out.println("验证码：" + captcha);

        // 验证阶段
        int maxTries = 3;
        boolean success = false;

        for (int i = 1; i <= maxTries; i++) {
            System.out.printf("\n请输入验证码 (不区分大小写，第%d/%d次): ", i, maxTries);
            String input = sc.nextLine();

            // 使用 equalsIgnoreCase 实现不区分大小写比对
            if (input.equalsIgnoreCase(captcha)) {
                System.out.println("验证成功！");
                success = true;
                break;
            } else {
                if (i < maxTries) {
                    System.out.println("验证码错误，请重新输入。");
                }
            }
        }

        if (!success) {
            System.err.println("尝试次数过多，请稍后再试。");
        }
    }

    private static String covertChar(char c) {
        if (Character.isLowerCase(c)) {
            // 小写转大写
            return String.valueOf(Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            // 大写转小写
            return String.valueOf(Character.toLowerCase(c));
        } else if (Character.isDigit(c)) {
            // 字符数字转数值并计算平方
            int num = Character.getNumericValue(c);
            return String.valueOf(num * num);
        } else {
            // 其他字符原样输出
            return String.valueOf(c);
        }
    }

    // 打印星号
    private static void printStars(String label, int count) {
        System.out.printf("%-6s: ", label); // 格式化对齐
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * 生成包含大小写字母和数字的随机验证码
     */
    public static String generateCaptcha(int length) {
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // 随机产生一个 0 到 pool.length()-1 之间的索引
            int index = random.nextInt(pool.length());
            sb.append(pool.charAt(index));
        }
        return sb.toString();
    }
}
