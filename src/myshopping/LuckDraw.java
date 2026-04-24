package myshopping;

public class LuckDraw {
    public static void main(String[] args) {
        int goods = 100;
        int money = 200;
        int i;
        int[] users = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] lucks = new boolean[users.length];

        for (i = 0; i < users.length - 1; i++) {
            boolean luck = goodLuck();
            lucks[i] = luck;
            System.out.println("用户" + users[i] + "抽奖是否中奖：" + luck);
        }
        int luckyCount = 0;
        for (i = 0; i < users.length; i++) {
            double finalPay; // 实际支付金额

            if (lucks[i]) {
                finalPay = goods * 0.8; // 中奖8折
                System.out.println("【中奖用户】用户" + users[i] + "，享受8折，需支付：" + finalPay + "元，剩余：" + (money - finalPay) + "元");
                luckyCount++;
            } else {
                finalPay = goods; // 没中奖原价
                System.out.println("【未中奖】用户" + users[i] + "，原价支付：" + finalPay + "元，剩余：" + (money - finalPay) + "元");
            }
        }

    }

    public static boolean goodLuck() {
        int chance = (int) (Math.random() * 100) + 1;
        return chance <= 20;
    }
}
