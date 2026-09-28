package applications;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDiffCalculator {
    public static void main(String[] args) {
        LocalDate first = LocalDate.of(2024, 3, 15);
        LocalDate second = LocalDate.of(2024, 5, 20);
        System.out.println("日期 1：" + first);
        System.out.println("日期 2：" + second);
        System.out.printf("天数差：%d 天%n", calculate(first, second));
    }

    public static long calculate(LocalDate first, LocalDate second) {
        return Math.abs(ChronoUnit.DAYS.between(first, second));
    }
}
