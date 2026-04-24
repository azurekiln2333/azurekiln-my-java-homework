import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ScoreManager {

    // 实现计算平均分的逻辑
    public static double calculateAverage(ArrayList<Double> scores) {
        // 防止除以 0
        if (scores.isEmpty()) return 0;
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    // 实现查找最高分的逻辑 输出最高分索引
    public static int findMax(ArrayList<Double> scores) {
        int maxIndex = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > scores.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 实现查找最低分的逻辑 输出最低分索引
    public static int findMin(ArrayList<Double> scores) {
        int minIndex = 0; // 假设第一个数是最小的，记录其下标
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < scores.get(minIndex)) {
                minIndex = i; // 更新最小值的下标
            }
        }
        return minIndex;
    }

    // 实现统计及格人数的逻辑
    public static int countPass(ArrayList<Double> scores) {
        int count = 0;
        for (double score : scores) {
            if (score >= 60) {
                count++;
            }
        }
        return count;
    }

    // 通过满分和当前成绩计算等级
    public static char getLevel(double score, int full) {
        if (score >= full * 0.9) {
            return 'A';
        } else if (score >= full * 0.8) {
            return 'B';
        } else if (score >= full * 0.7) {
            return 'C';
        } else if (score >= full * 0.6) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void getLevelCount(ArrayList<Double> scores, int full) {
        // 初始化Map 用于统计
        HashMap<Character, Integer> map = new HashMap<>();
        char[] levels = {'A', 'B', 'C', 'D', 'E'};
        for (char level: levels) {
            map.put(level, 0);
        }

        // 统计等级位数
        System.out.println("\n--- 学生成绩及等级 ---");
        for (int j = 1; j < scores.size(); j++) {
            char currLevel =  getLevel(scores.get(j), full);
            System.out.println("第" + j + "名：" + scores.get(j) + "->" + currLevel);
            map.put(currLevel, map.get(currLevel) + 1);
        }

        System.out.println("\n--- 等级统计表 ---");
        // 按照 A, B, C, D, E 的顺序打印
        for (char l : levels) {
            System.out.println("等级 " + l + " 的人数：" + map.get(l));
        }
    }

    // 分析趋势
    public static void analyzeTrend(ArrayList<Double> firstExam, ArrayList<Double> secondExam) {
        if (firstExam.size() != secondExam.size() || firstExam.isEmpty()) {
            System.out.println("两次考试人数不一致或数据为空，无法对比。");
            return;
        }

        int trendMaxIdx = 0;
        int trendMinIdx = 0;
        double maxGain = secondExam.get(0) - firstExam.get(0);
        double maxLoss = secondExam.get(0) - firstExam.get(0);

        System.out.println("\n--- 成绩波动分析 ---");
        for (int i = 0; i < firstExam.size(); i++) {
            double diff = secondExam.get(i) - firstExam.get(i);

            // 输出每位同学的变化
            String status = diff >= 0 ? "进步" : "退步";
            System.out.printf("学生 %d: 第一次 %.1f -> 第二次 %.1f (变动: %+.1f [%s])\n",
                    (i + 1), firstExam.get(i), secondExam.get(i), diff, status);

            // 寻找进步最明显的
            if (diff > maxGain) {
                maxGain = diff;
                trendMaxIdx = i;
            }
            // 寻找退步最明显的
            if (diff < maxLoss) {
                maxLoss = diff;
                trendMinIdx = i;
            }
        }

        System.out.println("\n--- 变动之最 ---");
        if (maxGain > 0) {
            System.out.printf("进步最多：学生 %d，进步了 %.1f 分！\n", (trendMaxIdx + 1), maxGain);
        } else {
            System.out.println("没有学生成绩有所进步。");
        }

        if (maxLoss < 0) {
            System.out.printf("退步最多：学生 %d，退步了 %.1f 分。\n", (trendMinIdx + 1), Math.abs(maxLoss));
        } else {
            System.out.println("没有学生成绩出现退步。");
        }
    }

    // 成绩录入
    public static ArrayList<Double> inputScores(Scanner scanner, int fullScore) {
        // 定义满分成绩
        ArrayList<Double> list = new ArrayList<>();
        // 输入成绩
        int i = 0;
        while (true) {
            System.out.print("第" + (i + 1) + "名学生成绩 (输入-1结束)：");
            double temp = scanner.nextDouble();
            if (temp == -1) break;
            if (temp >= 0 && temp <= fullScore) {
                list.add(temp);
                i++;
            } else {
                System.out.println("无效分值，请重输。");
            }
        }
        return list;
    }

    public static void summarize(ArrayList<Double> scores) {
        // 计算平均值
        double average = calculateAverage(scores);
        System.out.println("\n\n当前所有学生成绩平均分为：" + average);

        // 找出最大值
        int maxIndex = findMax(scores);
        System.out.println("当前所有学生成绩中最高分是第" + maxIndex + "位，为" + scores.get(maxIndex) + "分");

        // 找出最小值
        int minIndex = findMin(scores);
        System.out.println("当前所有学生成绩中最低分是第" + minIndex + "位，为" + scores.get(minIndex) + "分");

        // 统计及格人数
        int passCount = countPass(scores);
        System.out.println("当前所有学生成绩中及格人数：" + passCount + "位");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullScore = 100;
        System.out.println("=== 开始录入第一次考试成绩 ===");
        ArrayList<Double> firstExam = inputScores(scanner, fullScore); // 建议将你的输入逻辑封装成 inputScores 方法
        getLevelCount(firstExam, fullScore);
        summarize(firstExam);

        System.out.println("\n=== 开始录入第二次考试成绩 ===");
        ArrayList<Double> secondExam = inputScores(scanner, fullScore);
        getLevelCount(secondExam, fullScore);
        summarize(secondExam);

        analyzeTrend(firstExam, secondExam);
    }

}