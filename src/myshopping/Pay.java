package myshopping;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入折扣：");
        double discount = sc.nextDouble();

        int pigPrice = 245;
        int cawPrice = 570;
        int chickenPrice = 320;
        int pigNo = 3;
        int cawNo = 2;
        int chickenNo = 4;
        double finalPay = (pigPrice * pigNo + cawPrice * cawNo + chickenPrice * chickenNo) * discount;
        System.out.println("消费总金额：" + finalPay);
        double returnMoney = 3000 - finalPay;
        System.out.println("*******消费单*******");
        System.out.println("购买物品\t" + "单价\t" + "个数\t" + "金额\t");
        System.out.println("猪肉\t\t" + "￥" + pigPrice + "\t" + pigNo + "\t" + "￥" + (pigPrice * pigNo));
        System.out.println("牛肉\t\t" + "￥" + cawPrice + "\t" + cawNo + "\t" + "￥" + (cawPrice * cawNo));
        System.out.println("鸡肉\t\t" + "￥" + chickenPrice + "\t" + chickenNo + "\t" + "￥" + (chickenPrice * chickenNo));
        System.out.println("折扣" + discount * 10 + "折");
        System.out.println("消费总金额\t￥" + finalPay);
        System.out.println("实际交费\t￥3000");
        System.out.println("找钱\t\t￥" + returnMoney);
    }

}
