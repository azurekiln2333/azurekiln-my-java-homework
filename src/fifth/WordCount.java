package fifth;

public class WordCount {

    // 统计单词
    public static void countWords(String text) {
        System.out.println("待统计内容：" + text);
        System.out.println();

        // 转换为小写
        text = text.toLowerCase();
        // 按非字母字符分割
        String[] words = text.split("[^a-zA-Z]+");
        // 用数组保存单词和频次
        String[] wordArray = new String[1000];
        int[] countArray = new int[1000];
        int size = 0;

        // 统计词频
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            boolean found = false;
            // 查找单词是否已经存在
            for (int i = 0; i < size; i++) {
                if (wordArray[i].equals(word)) {
                    countArray[i]++;
                    found = true;
                    break;
                }
            }
            // 新单词
            if (!found) {
                wordArray[size] = word;
                countArray[size] = 1;
                size++;
            }
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                // 词频降序
                if (countArray[j] < countArray[j + 1] ||
                        (countArray[j] == countArray[j + 1] &&
                                wordArray[j].compareTo(wordArray[j + 1]) > 0)) {
                    // 交换频次
                    int tempCount = countArray[j];
                    countArray[j] = countArray[j + 1];
                    countArray[j + 1] = tempCount;
                    // 交换单词
                    String tempWord = wordArray[j];
                    wordArray[j] = wordArray[j + 1];
                    wordArray[j + 1] = tempWord;
                }
            }
        }

        // 输出前10个
        System.out.println("词频统计：");
        int limit = Math.min(10, size);
        for (int i = 0; i < limit; i++) {
            System.out.println(wordArray[i] + " : " + countArray[i]);
        }
    }

    public static void main(String[] args) {
        String text = "the cat and the dog and the bird and the fish";
        countWords(text);
    }
}