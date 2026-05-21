package ep5;

import java.util.Arrays;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(getRandomNumbers());
        stopWatch.stop();
        System.out.println("排序数组耗时：" + stopWatch.getElapsedTime());
    }

    private static int[] getRandomNumbers() {
        int[] nums = new int[10000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100000);
        }
        return nums;
    }
}
