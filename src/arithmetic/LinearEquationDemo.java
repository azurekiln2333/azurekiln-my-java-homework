package arithmetic;

import java.util.Scanner;

public class LinearEquationDemo {
    public static void main(String[] args) {
        double[] values = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double adbc, x, y;
        System.out.println("方程组\nax+by=e\ncx+dy=f\n请按顺序输入a,b,c,d,e,f：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            values[i] = sc.nextDouble();
        }
        adbc = values[0] * values[3] - values[1] * values[2];
        if (Math.abs(adbc) < 1e-10) {
            System.out.println("系数行列式为 0，方程组没有唯一解。");
            return;
        }
        x = (values[4] * values[3] - values[1] * values[5]) / adbc;
        y = (values[0] * values[5] - values[4] * values[2]) / adbc;

        System.out.println("解得 x=" + x + "，y=" + y);
    }
}
