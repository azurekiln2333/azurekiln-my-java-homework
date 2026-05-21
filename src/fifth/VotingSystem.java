package fifth;

import java.util.Scanner;

public class VotingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_VOTERS = 10;      // 每轮投票人数
        final int NUM_CANDIDATES = 5;   // 候选人数

        // 提示输入投票轮数
        System.out.print("请输入计划进行的投票轮数: ");
        int numRounds = scanner.nextInt();

        // 累计所有轮次的得票总数数组
        int[] totalVoteCounts = new int[NUM_CANDIDATES];

        System.out.println("\n====== 简易投票统计系统 ======");

        // 多轮投票控制
        for (int round = 1; round <= numRounds; round++) {
            System.out.println("\n--- 第 " + round + " 轮投票开始 ---");
            int[] currentVotes = new int[NUM_VOTERS];

            // 10位同学依次投票
            for (int i = 0; i < NUM_VOTERS; i++) {
                System.out.print("请第 " + (i + 1) + " 位同学输入投票编号 (1-5): ");
                int vote = scanner.nextInt();

                // 简单的输入合法性校验
                while (vote < 1 || vote > 5) {
                    System.out.print("无效编号！请重新输入 (1-5): ");
                    vote = scanner.nextInt();
                }
                currentVotes[i] = vote;
            }

            // 统计当前轮次得票
            int[] roundCounts = countVotes(currentVotes);

            // 计算当前轮次获胜者
            int roundWinner = findWinner(roundCounts);

            // 输出当前轮次结果并累加总票数
            System.out.println("\n>>> 第 " + round + " 轮投票结果 <<<");
            for (int i = 0; i < NUM_CANDIDATES; i++) {
                System.out.println((i + 1) + "号候选人得票: " + roundCounts[i] + " 票");
                totalVoteCounts[i] += roundCounts[i];
            }
            System.out.println("第 " + round + " 轮的获胜者是: " + roundWinner + "号候选人！");
        }

        // 累计统计输出
        System.out.println("\n=== 累计总得票 ===");
        for (int i = 0; i < NUM_CANDIDATES; i++) {
            System.out.println((i + 1) + "号候选人总计得票: " + totalVoteCounts[i] + " 票");
        }

        // 找寻总获胜者
        int overallWinner = findWinner(totalVoteCounts);
        System.out.println("\n最终总获胜者是: " + overallWinner + "号候选人！");

        scanner.close();
    }

    public static int[] countVotes(int[] votes) {
        int[] counts = new int[5]; // 默认全为0，counts[0]对应1号，以此类推
        for (int vote : votes) {
            // vote的值是1到5，所以对应的索引是 vote - 1
            counts[vote - 1]++;
        }
        return counts;
    }

    public static int findWinner(int[] voteCounts) {
        int maxVotes = -1;
        int winnerIndex = -1;

        // 从左往右遍历寻找最大值
        for (int i = 0; i < voteCounts.length; i++) {
            if (voteCounts[i] > maxVotes) {
                maxVotes = voteCounts[i];
                winnerIndex = i;
            }
        }
        return winnerIndex + 1;
    }
}