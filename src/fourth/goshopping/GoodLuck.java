package fourth.goshopping;

import java.util.Scanner;

public class GoodLuck {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        System.out.println("乐Go购物系统 > 幸运抽奖");
        System.out.println("请输入4位会员卡号：");
        Scanner input = new Scanner(System.in);
        int custNo = input.nextInt();
        int b = custNo / 100 % 10;
        if (b == random) {
            System.out.println(custNo + "是幸运用户，获精美礼品一份。");
        } else {
            System.out.println(custNo + "谢谢您的支持！");
        }
    }
}
