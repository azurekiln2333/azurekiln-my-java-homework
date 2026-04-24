import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个系数a,b,c：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        solveAndAnalyze(a, b, c);
    }

    public static void solveAndAnalyze(double a, double b, double c) {
        if (Math.abs(a) < 1e-10) {
            System.out.println("这不是一个一元二次方程！");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("方程有两个实根：x1=%.2f，x2=%.2f%n", x1, x2);
        } else if (Math.abs(delta) < 1e-10) {
            double x = -b / (2 * a);
            System.out.printf("方程有一个重根：x = %.2f%n", x);
        } else {
            System.out.println("方程无实数解。");
            double realPart = -b / (2 * a);
            if (Math.abs(realPart) < 1e-10) realPart = 0.0;
            // 虚部取正值，避免出现类似 "+ -3.00i" 的格式
            double imagPart = Math.sqrt(-delta) / Math.abs(2 * a);

            System.out.printf("无实数解，有两个共轭复数根：x1 = %.2f + %.2fi, x2 = %.2f - %.2fi\n",
                    realPart, imagPart, realPart, imagPart);
        }

        System.out.print("[图像分析]\n");
        System.out.print(a > 0 ? "开口方向：向上\n" : "  - 开口方向：向下\n");

        double symmetryAxis = -b / (2 * a);
        if (Math.abs(symmetryAxis) < 1e-10) symmetryAxis = 0.0;
        System.out.printf("对称轴方程：x = %.2f\n%n", symmetryAxis);

        double vertexY = (4 * a * c - b * b) / (4 * a);
        System.out.printf("顶点坐标：(%.2f, %.2f)\n%n", symmetryAxis, vertexY);

        System.out.printf("与 y 轴交点：(0.00, %.2f)\n%n", c);

        if (a > 0) {
            System.out.printf("单调区间：x ∈ (-∞, %.2f) 时单调递减；x ∈ (%.2f, +∞) 时单调递增\n%n", symmetryAxis, symmetryAxis);
        } else {
            System.out.printf("单调区间：x ∈ (-∞, %.2f) 时单调递增；x ∈ (%.2f, +∞) 时单调递减\n", symmetryAxis, symmetryAxis);
        }
    }
}