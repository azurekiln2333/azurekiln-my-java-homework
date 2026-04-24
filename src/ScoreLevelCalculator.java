public class ScoreLevelCalculator {
    public static void main(String[] args) {
        double[] testScores = new double[]{60, 89, 92};
        for (double testScore : testScores) {
            char level = getLevel(testScore);
            System.out.printf("学生总分：%.2f分，等级：%c等\n", testScore, level);
        }
    }

    public static char getLevel(double score) {
        return (score >= 135) ? 'A' : (score >= 120) ? 'B' :
                (score >= 105) ? 'C' : (score >= 90) ? 'D' : 'E';
    }
}
