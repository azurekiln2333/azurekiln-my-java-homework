import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        double applePrice = 3.5;
        double bananaPrice = 2.8;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入购买了多少斤苹果：");
        double appleWeight = sc.nextDouble();
        System.out.println("请输入购买了多少斤香蕉：");
        double bananaWeight = sc.nextDouble();
        double accountsPayable = appleWeight * applePrice + bananaWeight * bananaPrice;
        double amountPaid = accountsPayable;
        double discount = 0.0;
        if (accountsPayable >= 150) {
            discount = 35;
        } else if (accountsPayable >= 100) {
            discount = 20;
        } else if (accountsPayable >= 50) {
            discount = 8;
        }
        amountPaid -= discount;
        System.out.printf("购买苹果%.2f斤，香蕉%.2f斤，原价%.2f元，满减%.2f元，实付%.2f元", appleWeight, bananaWeight, accountsPayable, discount, amountPaid);
    }
}
