import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//         System.out.println("Welcome to Java！");
//        }
//
//        System.out.println("    J     A     V     V     A");
//        System.out.println("    J    A A     V   V     A A");
//        System.out.println("J   J   AAAAA     V V     AAAAA");
//        System.out.println(" J J   A     A     V     A     A");

//        int terms = 1000000;
//        double pi = 0.0;
//        double b = 1.0;
//        int s = 1;
//
//        for (int i = 1; i<=terms; i++) {
//            double c = s * (1.0/b);
//            pi += c;
//            b += 2;
//            s *= -1;
//        }
//        pi *= 4;
//        System.out.println("计算出来的pi="+String.format("%.4f", pi));

        double[] values = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double adbc, x, y;
        System.out.println("方程组\nax+by=e\ncx+dy=f\n请按顺序输入a,b,c,d,e,f：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            values[i] = sc.nextDouble();
        }
        adbc = values[0] * values[3] - values[1] * values[2];
        x = (values[4] * values[3] - values[1] * values[5]) / adbc;
        y = (values[0] * values[5] - values[4] * values[2]) / adbc;

        System.out.println("解得x=" + x + "y=" + y);
        int e = 987;
        System.out.println(e / 100);
        System.out.println(e % 100 / 10);
        System.out.println(e % 10);
    }
}