import java.util.Arrays;
import java.util.Scanner;

public class DisplayNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入三个数: ");

        double[] nums = new double[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = input.nextDouble();
        }

        displaySortedNumbers(nums);
    }

    public static void displaySortedNumbers(double[] numbers) {
        Arrays.sort(numbers);
        System.out.println("升序排列结果为: ");
        for (double n : numbers) {
            System.out.print(n + " ");
        }
    }
}
