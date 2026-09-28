package applications;

public class ExpressCalculator {
    public static void main(String[] args) {
        double[] testWeights = new double[]{1.5, 3.3};
        boolean[] testFar = new boolean[]{false, true};
        for (double weight : testWeights) {
            for (boolean isFar : testFar) {
                calculate(weight, isFar);
            }
        }
    }

    public static void calculate(double weight, boolean isFar) {
        int baseFee = 10;
        int finalWeight = (int) Math.ceil(weight);
        // 超重计算
        int extraWeight = Math.max(0, finalWeight - 1);
        int extraFee = extraWeight * 3;
        // 偏远地区附加费
        double remoteFee = isFar ? (baseFee + extraFee) * 0.1 : 0;

        double finalTotalFee = baseFee + extraFee + remoteFee;
        System.out.println("-----------------------------------------");
        System.out.printf("包裹重量：%.1fkg，是否偏远：%b，总运费：%.2f 元\n",
                weight, isFar, finalTotalFee);
        System.out.println("-----------------------------------------");
    }
}
