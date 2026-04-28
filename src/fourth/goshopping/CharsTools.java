package fourth.goshopping;

public class CharsTools {
    public static void main(String[] args) {
        System.out.println("打印从 '1' 到 'Z' 的字符：");
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;

        for (char c = ch1; c <= ch2; c++) {
            System.out.print(c + " ");
            count++;
            // 当打印的字符数达到 numberPerLine 时换行
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }

        if (count % numberPerLine != 0) {
            System.out.println();
        }
    }
}
