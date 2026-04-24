import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== 用户注册 ======");
        String registeredUsername = "";
        String registeredPassword = "";
        System.out.print("请输入用户名 (要求：长度≥3且不能包含空格): ");
        while (true) {
            registeredUsername = sc.nextLine();
            if (isUserNameValid(registeredUsername)) {
                System.out.println("用户名校验通过！");
                break;
            } else {
                System.out.println("用户名不符合要求，请重新输入。");
            }
        }
        System.out.print("请输入密码 (要求：长度6-12且必须同时包含字母和数字): ");
        while (true) {
            registeredPassword = sc.nextLine();
            if (isPasswordValid(registeredPassword)) {
                System.out.println("密码校验通过，注册成功");
                break;
            } else {
                System.out.println("密码不符合要求，请重新输入。");
            }
        }

        int maxAttempts = 3;
        int currentAttempt = 0;
        boolean isLocked = false;
        System.out.println("====== 用户登录 ======");
        System.out.print("请输入用户名: ");
        String loginUser = sc.nextLine();
        while (true) {
            System.out.print("请输入密码: ");
            String loginPass = sc.nextLine();
            if (loginUser.equals(registeredUsername) && loginPass.equals(registeredPassword)) {
                System.out.println("\n登录成功！欢迎回来，" + loginUser + "！");
                break;
            } else {
                currentAttempt++;
                int remaining = maxAttempts - currentAttempt;

                if (remaining > 0) {
                    System.out.printf("  -> [错误] 用户名或密码不正确！还剩 %d 次机会。\n", remaining);
                } else {
                    isLocked = true;
                }
            }
        }
    }

    public static boolean isUserNameValid(String username) {
        return (username.length() >= 3 && !username.contains(" "));
    }

    public static boolean isPasswordValid(String password) {
        if (password.length() < 6 || password.length() > 12) {
            System.out.println("密码长度必须在6-12位之间");
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasLetter) {
            System.out.println("密码必须包含至少一个字母");
            return false;
        }

        if (!hasDigit) {
            System.out.println("密码必须包含至少一个数字");
            return false;
        }
        return true;
    }
}
