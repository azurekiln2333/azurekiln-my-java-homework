package fifth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringFilterSystem {
    public static void main(String[] args) {
        final Map<String, Integer> sensitiveWord = new HashMap<>();
        initKeywords(sensitiveWord);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String originalText = scanner.nextLine();

        filterSensitiveWords(originalText, sensitiveWord);
    }

    private static void initKeywords(Map<String, Integer> sensitiveWord) {
        sensitiveWord.put("暴力", 1);
        sensitiveWord.put("色情", 1);
        sensitiveWord.put("毒品", 2);
        sensitiveWord.put("赌博", 2);
        sensitiveWord.put("笨蛋", 3);
        sensitiveWord.put("白痴", 3);
    }

    private static void filterSensitiveWords(String text, Map<String, Integer> sensitiveWord) {
        String filteredText = text;
        int level1Count = 0;
        int level2Count = 0;
        int level3Count = 0;
        int totalCount = 0;

        // 遍历敏感词库
        for (Map.Entry<String, Integer> entry : sensitiveWord.entrySet()) {
            String word = entry.getKey();
            int level = entry.getValue();

            if (filteredText.contains(word)) {
                // 计算当前敏感词在文本中出现的次数
                int count = (filteredText.length() - filteredText.replace(word, "").length()) / word.length();
                totalCount += count;

                // 根据等级确定替换符号
                String replacement = "";
                switch (level) {
                    case 1:
                        replacement = "****";
                        level1Count += count;
                        break;
                    case 2:
                        replacement = "***";
                        level2Count += count;
                        break;
                    case 3:
                        replacement = "*";
                        level3Count += count;
                        break;
                }

                // 进行替换 (注意：replace会替换所有匹配的子串)
                filteredText = filteredText.replace(word, replacement);
            }
        }

        // 输出结果
        System.out.println("过滤后文本: " + filteredText);

        System.out.println("\n统计报告：");
        System.out.println("共拦截敏感词: " + totalCount + " 次");
        System.out.println("一级敏感词（严重）触发: " + level1Count + " 次");
        System.out.println("二级敏感词（中度）触发: " + level2Count + " 次");
        System.out.println("三级敏感词（轻度）触发: " + level3Count + " 次");
    }
}
