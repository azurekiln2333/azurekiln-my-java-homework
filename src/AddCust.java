import java.util.Scanner;

public class AddCust {
    public static void main(String[] args) {
        System.out.println("乐购购物系统>客户信息管理>添加客户信息");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员号（4位整数）：");
        int cusNo = input.nextInt();
        System.out.print("请输入会员生日(月/日<用两位数表示>)：");
        String cusBirth = input.next();
        System.out.println("请输入积分：");
        int cusScore = input.nextInt();
        if (cusNo >= 1000 && cusNo <= 9999) {
            System.out.println("已录入的会员信息是：");
            System.out.println(cusNo + " " + cusBirth + " " + cusScore);
        } else {
            System.out.println("会员" + cusNo + "无效");
            System.out.println("会员录入信息失败！");
        }

    }
}
