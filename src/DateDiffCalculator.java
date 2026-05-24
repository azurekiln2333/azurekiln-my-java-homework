public class DateDiffCalculator {
    public static void main(String[] args) {
        // 2024-03-15
        int y1 = 2024, m1 = 3, d1 = 15;
        // 2024-05-20
        int y2 = 2024, m2 = 5, d2 = 20;

        int absoluteDiff = 0;

        if (y1 == y2) {
            absoluteDiff = calculate((m1 - 1) * 30 + d1, (m2 - 1) * 30 + d2);
        } else if (y1 < y2) {
            absoluteDiff = calculate((m1 - 1) * 30 + d1, (m2 - 1 - 12 * (y2 - y1)) * 30 + d2);
        } else {
            absoluteDiff = calculate((m2 - 1 - 12 * (y1 - y2)) * 30 + d2, (m1 - 1) * 30 + d1);
        }

        System.out.printf("日期 1：%d 年 %02d 月 %02d 日\n", y1, m1, d1);
        System.out.printf("日期 2：%d 年 %02d 月 %02d 日\n", y2, m2, d2);
        System.out.printf("天数差：%d 天\n", absoluteDiff);
    }

    public static int calculate(int totalDays1, int totalDays2) {
        int diff = totalDays2 - totalDays1;

        return diff < 0 ? -diff : diff;
    }
}