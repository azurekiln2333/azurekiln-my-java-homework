public class SalaryCalculator {
    public static void main(String[] args) {
        int baseSalary = 3500;
        double[] testPRs = new double[]{0.8, 1.5};
        for (double testPR: testPRs) {
            calculate(baseSalary, testPR);
        }
    }

    public static void calculate(int baseSalary, double performanceRate) {
        // 绩效奖金
        double bonus = baseSalary * performanceRate;
        // 社保
        double insurance = baseSalary * 0.1;
        // 应纳税所得额
        double taxableIncome = baseSalary + bonus - insurance - 5000;
        // 个人所得税
        double tax = 0;
        if (taxableIncome >= 0) {
            tax = taxableIncome * 0.03;
        }
        // 实发工资
        double finalSalary = baseSalary + bonus - insurance - tax;
        System.out.println("-----------------------------------------");
        System.out.printf("当前基本工资：%d 元\n绩效系数：%.1f\n绩效奖金：%.2f 元\n社保：%.2f 元\n应纳税所得额：%.2f 元\n个人所得税：%.2f 元\n实发工资：%.2f 元\n",
                baseSalary, performanceRate, bonus, insurance, taxableIncome, tax, finalSalary);
        System.out.println("-----------------------------------------");
    }
}
