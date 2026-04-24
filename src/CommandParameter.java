import java.util.Calendar;

public class CommandParameter {
    public static void main(String[] args) {
        long n = 461012;
        System.out.printf("%d%n", n);
        System.out.printf("%08d%n", n);
        System.out.printf("%+8d%n", n);
        System.out.printf("%,8d%n", n);
        System.out.printf("%+,8d%n%n", n);
        double pi = Math.PI;
        System.out.printf("%f%n", pi);
        System.out.printf("%.3f%n", pi);
        System.out.printf("%10.3f%n", pi);
        System.out.printf("%-10.3f%n", pi);
        Calendar c = Calendar.getInstance();
        System.out.printf("%tB %te, %tY%n", c, c, c);
        System.out.printf("%tl:%tM %tp%n", c, c, c);
        System.out.printf("%tD%n", c);
    }
}