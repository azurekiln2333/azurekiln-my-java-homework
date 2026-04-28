package fourth.goshopping;

import java.util.Scanner;

public class ConsumeSavePlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double money = input.nextDouble();
        System.out.println("是否参加优惠换购活动（输入下列编号）：");
        System.out.println("1：单次消费满50元的客户，加2元可换购百事可乐饮料1瓶；");
        System.out.println("2：单次消费满100元的客户，加3元可换购百事可乐500ml饮料1瓶；");
        System.out.println("3：单次消费满100元的客户，加10元可换购5kg面粉1袋；");
        System.out.println("4：单次消费满200元的客户，加10元可换购苏泊尔炒锅1个；");
        System.out.println("5：单次消费满200元的客户，加20元可换购欧莱雅柔肤水1瓶；");
        System.out.println("0：不换购");
        System.out.println("请选择:");

        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                money += 2;
            }
            case 2 -> {
                money += 3;
            }
            case 3, 4 -> {
                money += 10;
            }
            case 5 -> {
                money += 20;
            }
        }

        System.out.println("本次消费金额总额：" + money);
        switch (choice) {
            case 1 -> {
                System.out.println("成功换购：百事可乐1瓶");
            }
            case 2 -> {
                System.out.println("成功换购：500ml百事可乐1瓶");
            }
            case 3 -> {
                System.out.println("成功换购：5kg免费1袋");
            }
            case 4 -> {
                System.out.println("成功换购：苏泊尔炒锅1个");
            }
            case 5 -> {
                System.out.println("成功换购：欧莱雅柔肤水1瓶");
            }
            case 0 -> System.out.println("选择不换购");
            default -> System.out.println("输入错误！");
        }
    }
}
