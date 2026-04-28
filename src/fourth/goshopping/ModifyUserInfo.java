package fourth.goshopping;

import java.util.Scanner;

public class ModifyUserInfo {
    public static void main(String[] args) {
        String goods = "冰箱";
        double price = 1000.00;
        System.out.println("乐Go购物管理系统 > 商品信息管理 > 修改商品信息\n");
        System.out.println("请输入需要修改的商品名称：");
        Scanner input = new Scanner(System.in);
        String goodsName = input.next();
        // 判断输入商品名称是否存在
        if (goods.equals(goodsName)) {
            System.out.println("请输入新的商品名称：");
            input = new Scanner(System.in);
            goodsName = input.next();
            if (!goodsName.equals(goods)) {
                goods = goodsName;
                System.out.println("商品名称修改成功！\n");
                System.out.println("请输入新的商品价格");
                double flag = input.nextDouble();
                price = flag;
                System.out.println("商品价格修改成功！\n");
                System.out.println("输入a打印的新的商品名称\n" + "输入b打印新的商品价格\n输入c打印新的商品信息\n输入其他退出：");
                input = new Scanner(System.in);
                String enter = input.next();
                // 通过输入不同的命令打印不同的信息
                switch (enter) {
                    case "a":
                        System.out.println("新的商品名称为：" + goods);
                        break;
                    case "b":
                        System.out.println("新的商品价格为：" + price);
                        break;
                    case "c":
                        System.out.println("商品名称：" + goodsName + "\t商品价格：" + price);
                        break;
                    default:
                        System.out.println("退出成功！");
                }
            } else {
                System.out.println("该商品已存在！");
            }
        } else {
            System.out.println("没有找到您需要修改的商品！");
        }
    }
}
