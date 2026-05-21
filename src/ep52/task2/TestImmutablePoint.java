package ep52.task2;

public class TestImmutablePoint {

    public static void main(String[] args) {
        System.out.println("=== 测试不可变点类 ===");
        ImmutablePoint p1 = new ImmutablePoint(3, 4);
        ImmutablePoint p2 = new ImmutablePoint(6, 8);
        ImmutablePoint p3 = new ImmutablePoint(3, 4);
        System.out.println("点 p1：" + p1.getInfo());
        System.out.println("点 p2：" + p2.getInfo());
        System.out.println("点 p3：" + p3.getInfo());

        System.out.println();
        System.out.println("=== 距离测试 ===");
        System.out.println("p1 到 p2 距离：" + p1.distance(p2));
        System.out.println("p1 到 原点 距离：" + p1.distance(new ImmutablePoint(0, 0)));
        System.out.println("p2 到 原点 距离：" + p1.distance(new ImmutablePoint(0, 0)));

        // 验证不可变性
        System.out.println();
        System.out.println("=== 验证不可变性 ===");
        System.out.println("// p1.x = 10.0; // 无法为final变量赋值");
        System.out.println("// p1.setX(10.0); // 没有setter方法");
        System.out.println("p1 的坐标仍然是：" + p1.getInfo());

        // 校验
        System.out.println();
        System.out.println("=== equals 和 hashCode 测试 ===");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));

        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());

        System.out.println("p1 和 p3 hashCode 是否相同：" + (p1.hashCode() == p3.hashCode()));
    }
}

