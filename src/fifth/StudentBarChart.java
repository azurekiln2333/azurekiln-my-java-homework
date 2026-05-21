package fifth;

public class StudentBarChart {

    // 绘制单个班级成绩柱状图
    public static void drawBarChart(int[] scores) {

        System.out.println("===== 学生成绩柱状图 =====");

        for (int score : scores) {
            int starCount = score / 10; // 85/10=8颗星
            System.out.printf("%3d: ", score);
            for (int j = 0; j < starCount; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }

    // 计算平均分
    public static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // 绘制多个班级平均分对比柱状图
    public static void drawCompareChart(String[] classNames, int[][] allScores, char[] symbols) {
        System.out.println("\n===== 班级平均分对比 =====");
        for (int i = 0; i < allScores.length; i++) {

            double avg = average(allScores[i]);

            int barLength = (int) avg / 5;

            System.out.printf("%-2s 平均分:%6.2f | ", classNames[i], avg);
            for (int j = 0; j < barLength; j++) {
                System.out.print(symbols[i]);
            }
            System.out.print("\t" + (int) avg + "%");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 成绩表
        int[][] allScores = {
                {85, 92, 67, 45, 100}, // 一班
                {75, 80, 88, 90, 95},  // 二班
                {60, 70, 65, 72, 68}   // 三班
        };
        drawBarChart(allScores[0]);

        String[] classNames = {"一班", "二班", "三班"};
        char[] symbols = {'*', '#', '@'};
        drawCompareChart(classNames, allScores, symbols);
    }
}