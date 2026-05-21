package fifth;

public class CaesarCipher {

    // 加密
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        // 字母移位范围
        int letterShift = shift % 26;
        // 数字移位范围
        int digitShift = shift % 10;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // 大写字母
                char encrypted = (char) ((ch - 'A' + letterShift + 26) % 26 + 'A');
                result.append(encrypted);
            } else if (ch >= 'a' && ch <= 'z') {
                // 小写字母
                char encrypted = (char) ((ch - 'a' + letterShift + 26) % 26 + 'a');
                result.append(encrypted);
            } else if (ch >= '0' && ch <= '9') {
                // 数字
                char encrypted = (char) ((ch - '0' + digitShift + 10) % 10 + '0');
                result.append(encrypted);
            } else {
                // 其他字符不变
                result.append(ch);
            }
        }
        return result.toString();
    }

    // 解密
    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    // 暴力破解
    public static void bruteForce(String cipherText) {
        System.out.println("=== 暴力破解结果 ===");

        for (int shift = 1; shift < 26; shift++) {
            String decrypted = decrypt(cipherText, shift);
            System.out.println("Shift = " + shift + " : " + decrypted);
        }
    }

    // 主方法测试
    public static void main(String[] args) {
        String text = "Hello, World!Hello123";
        int shift = 3;
        // 加密
        String encrypted = encrypt(text, shift);
        // 解密
        String decrypted = decrypt(encrypted, shift);

        System.out.println("原文: " + text);
        System.out.println("加密后: " + encrypted);
        System.out.println("解密后: " + decrypted);

        // 暴力破解
        System.out.println();
        bruteForce(encrypted);
    }
}