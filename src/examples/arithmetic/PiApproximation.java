package examples.arithmetic;

public class PiApproximation {
    public static void main(String[] args) {
        int terms = 1_000_000;
        double pi = 0.0;
        for (int i = 0; i < terms; i++) {
            pi += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
        }
        System.out.printf("计算出来的 pi=%.4f%n", 4 * pi);
    }
}
