package myshopping;

import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        int price = 159;
        System.out.print("请输入商品折扣：");
        Scanner sc = new Scanner(System.in);
        double discount = sc.nextDouble();
        double finalPrice = price * discount;
        boolean result = finalPrice < 100;
        System.out.println("商品折扣后的价格是否低于100？" + result);
    }
}
