package fifth;

public class PolynomialCalculator {

    // 多项式加法
    public static double[] addPolynomial(double[] p1, double[] p2) {
        int maxLen = Math.max(p1.length, p2.length);
        double[] result = new double[maxLen];
        for (int i = 0; i < p1.length; i++) {
            result[i] += p1[i];
        }
        for (int i = 0; i < p2.length; i++) {
            result[i] += p2[i];
        }
        return result;
    }

    // 多项式乘法（挑战）
    public static double[] multiplyPolynomial(double[] p1, double[] p2) {
        double[] result = new double[p1.length + p2.length - 1];
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {

                result[i + j] += p1[i] * p2[j];
            }
        }

        return result;
    }

    // 多项式求值
    public static double evaluate(double[] poly, double x) {

        double result = 0;

        for (int i = 0; i < poly.length; i++) {

            result += poly[i] * Math.pow(x, i);
        }

        return result;
    }

    // 多项式求导
    public static double[] derivative(double[] poly) {
        // 常数求导为0
        if (poly.length == 1) {
            return new double[]{0};
        }
        double[] result = new double[poly.length - 1];
        for (int i = 1; i < poly.length; i++) {
            result[i - 1] = poly[i] * i;
        }
        return result;
    }

    // 多项式定积分
    public static double definiteIntegral(double[] poly, double a, double b) {
        double result = 0;
        for (int i = 0; i < poly.length; i++) {
            double coefficient = poly[i] / (i + 1);
            result += coefficient * (Math.pow(b, i + 1) - Math.pow(a, i + 1));
        }
        return result;
    }

    // 多项式转字符串
    public static String toString(double[] poly) {
        StringBuilder sb = new StringBuilder();
        for (int i = poly.length - 1; i >= 0; i--) {
            double coef = poly[i];
            // 跳过0项
            if (coef == 0) {
                continue;
            }
            // 正负号处理
            if (!sb.isEmpty()) {
                if (coef > 0) {
                    sb.append(" + ");
                } else {
                    sb.append(" - ");
                    coef = -coef;
                }
            } else {
                if (coef < 0) {
                    sb.append("-");
                    coef = -coef;
                }
            }
            // 系数和指数
            if (i == 0) {
                sb.append(coef);
            } else if (i == 1) {
                sb.append(coef).append("x");
            } else {
                sb.append(coef).append("x^").append(i);
            }
        }
        return sb.toString();
    }

    // 测试
    public static void main(String[] args) {
        // P1 = 3x^4 + 2x^2 + 5
        double[] p1 = {5, 0, 2, 0, 3};
        // P2 = 2x^3 - x + 1
        double[] p2 = {1, -1, 0, 2};
        System.out.println("P1(x) = " + toString(p1));
        System.out.println("P2(x) = " + toString(p2));
        // 加法
        double[] sum = addPolynomial(p1, p2);
        System.out.print("\nP1 + P2 = ");
        System.out.println(toString(sum));
        // 乘法
        double[] product = multiplyPolynomial(p1, p2);
        System.out.print("\nP1 * P2 = ");
        System.out.println(toString(product));
        // 求值
        double x = 2;
        System.out.println("\nP1(2) = " + evaluate(p1, x));
        // 求导
        double[] derivative = derivative(p1);
        System.out.print("\nP1'(x) = ");
        System.out.println(toString(derivative));
        // 定积分
        double integral = definiteIntegral(p1, 0, 1);
        System.out.printf("\n∫P1(x)dx [0,1] = %.3f", integral);
    }
}