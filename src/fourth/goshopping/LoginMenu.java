package fourth.goshopping;

import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        System.out.println("\n\n\t\t\t\t欢迎使用乐Go购物管理系统\n\n");
        System.out.println("************************************************\n");
        System.out.println("\t\t\t\t 1. 登录系统\n\n");
        System.out.println("\t\t\t\t 2. 退出系统\n\n");
        System.out.println("************************************************\n");
        System.out.println("请输入数字选择：");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int num = input.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("\n\n\t\t\t\t欢迎使用乐Go购物管理系统\n\n");
                    System.out.println("************************************************\n");
                    System.out.println("\t\t\t\t 1. 客户信息管理\n\n");
                    System.out.println("\t\t\t\t 2. 购物结算\n\n");
                    System.out.println("\t\t\t\t 3. 真情回馈\n\n");
                    System.out.println("\t\t\t\t 4. 注销\n\n");
                    System.out.println("************************************************\n");
                    System.out.println("请输入数字选择：");
                }
                case 2 -> System.out.println("感谢您的使用！");
                default -> System.out.println("输入错误！");
            }
            if (input.hasNextInt()) {
                int num1 = input.nextInt();
                switch (num1) {
                    case 1 -> {
                        System.out.println("\n\n\t\t\t\t乐Go购物管理系统 > 客户信息管理\n\n");
                        System.out.println("************************************************\n");
                        System.out.println("\t\t\t\t 1. 显示所有客户信息\n\n");
                        System.out.println("\t\t\t\t 2. 添加客户信息\n\n");
                        System.out.println("\t\t\t\t 3. 修改客户信息\n\n");
                        System.out.println("\t\t\t\t 4. 查询客户信息\n\n");
                        System.out.println("************************************************\n");
                        System.out.println("请输入数字选择：");
                    }
                    case 2 -> System.out.println("购物结算");
                    case 3 -> {
                        System.out.println("\n\n\t\t\t\t乐Go购物管理系统 > 真情回顾\n\n");
                        System.out.println("************************************************\n");
                        System.out.println("\t\t\t\t 1. 幸运大放送\n\n");
                        System.out.println("\t\t\t\t 2. 幸运抽奖\n\n");
                        System.out.println("\t\t\t\t 3. 生日问候\n\n");
                        System.out.println("************************************************\n");
                        System.out.println("请输入数字选择：");
                    }
                    case 4 -> System.out.println("注销");
                    default -> System.out.println("输入错误！");
                }
            } else {
                System.out.println("请输入正确的数字");
            }
        } else {
            System.out.println("请输入正确的数字");
        }
    }
}
