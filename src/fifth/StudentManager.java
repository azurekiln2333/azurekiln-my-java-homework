package fifth;

import java.util.Scanner;

public class StudentManager {
    private static int capacity = 5;
    private static String[] studentIds = new String[capacity]; // 增加学号数组
    private static String[] names = new String[capacity];
    private static int[] ages = new int[capacity];
    private static double[] scores = new double[capacity];

    private static int count = 0; // 实际学生数量
    private static int nextIdSequence = 1; // 学号序列生成器，只增不减

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n====== 学生信息管理系统 ======");
            System.out.println("1. 添加学生");
            System.out.println("2. 查找学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 显示所有学生");
            System.out.println("5. 统计平均分");
            System.out.println("6. 显示第一名");
            System.out.println("0. 退出系统");
            System.out.print("请选择: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("请输入姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入年龄: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("请输入成绩: ");
                    double score = Double.parseDouble(scanner.nextLine());
                    addStudent(name, age, score);
                    break;
                case "2":
                    System.out.print("请输入要查找的姓名或学号: ");
                    String keyword = scanner.nextLine();
                    int index = findStudent(keyword);
                    if (index != -1) {
                        printStudentInfo(index);
                    } else {
                        System.out.println("未找到该学生！");
                    }
                    break;
                case "3":
                    System.out.print("请输入要删除的学生姓名或学号: ");
                    String delKeyword = scanner.nextLine();
                    deleteStudent(delKeyword, scanner);
                    break;
                case "4":
                    displayAllStudents();
                    break;
                case "5":
                    getAverageScore();
                    break;
                case "6":
                    getTopStudent();
                    break;
                case "0":
                    System.out.println("感谢使用，再见！");
                    scanner.close();
                    return;
                default:
                    System.out.println("输入无效，请重新选择！");
            }
        }
    }

    // 添加学生
    private static void addStudent(String name, int age, double score) {
        // 检查是否需要扩容
        if (count >= studentIds.length) {
            int newCapacity = studentIds.length * 3 / 2 + 1;
            String[] newStudentIds = new String[newCapacity];
            String[] newNames = new String[newCapacity];
            int[] newAges = new int[newCapacity];
            double[] newScores = new double[newCapacity];

            // 拷贝原数组
            System.arraycopy(studentIds, 0, newStudentIds, 0, count);
            System.arraycopy(names, 0, newNames, 0, count);
            System.arraycopy(ages, 0, newAges, 0, count);
            System.arraycopy(scores, 0, newScores, 0, count);

            // 重新赋值引用
            studentIds = newStudentIds;
            names = newNames;
            ages = newAges;
            scores = newScores;
            System.out.println("数组已自动扩容至：" + studentIds.length);
        }

        // 问题1：生成学号 2024 + 3位序号
        String newId = "2024" + String.format("%03d", nextIdSequence++);

        studentIds[count] = newId;
        names[count] = name;
        ages[count] = age;
        scores[count] = score;
        count++;

        System.out.println("添加成功！学号分配为: " + newId + "。当前共 " + count + " 名学生。");
    }

    // 查找学生
    private static int findStudent(String keyword) {
        for (int i = 0; i < count; i++) {
            if (studentIds[i].equals(keyword) || names[i].equals(keyword)) {
                return i; // 找到返回索引
            }
        }
        return -1;
    }

    // 删除学生
    private static void deleteStudent(String keyword, Scanner scanner) {
        int index = findStudent(keyword);
        if (index == -1) {
            System.out.println("未找到该学生，删除失败！");
            return;
        }

        // 边界处理：删除确认
        System.out.print("确认删除学生 [" + names[index] + "] 吗？(y/n): ");
        if (!scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("已取消删除。");
            return;
        }

        // 核心逻辑：元素前移覆盖
        for (int i = index; i < count - 1; i++) {
            studentIds[i] = studentIds[i + 1];
            names[i] = names[i + 1];
            ages[i] = ages[i + 1];
            scores[i] = scores[i + 1];
        }

        // 清理最后一个元素的数据（防止内存泄漏）
        studentIds[count - 1] = null;
        names[count - 1] = null;
        ages[count - 1] = 0;
        scores[count - 1] = 0.0;

        count--;
        System.out.println("删除成功！");
    }

    // 显示所有学生
    private static void displayAllStudents() {
        if (count == 0) {
            System.out.println("当前没有任何学生信息。");
            return;
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("%-12s %-10s %-6s %-6s\n", "学号", "姓名", "年龄", "成绩");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-12s %-10s %-6d %-6.2f\n", studentIds[i], names[i], ages[i], scores[i]);
        }
        System.out.println("--------------------------------------------------");
    }

    // 打印单个学生信息的辅助方法
    private static void printStudentInfo(int index) {
        System.out.printf("找到学生: 学号=%s, 姓名=%s, 年龄=%d, 成绩=%.2f\n",
                studentIds[index], names[index], ages[index], scores[index]);
    }

    // 计算全班平均分
    private static void getAverageScore() {
        if (count == 0) {
            System.out.println("当前无学生，平均分为: 0.0");
            return;
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        System.out.printf("全班平均分为: %.2f\n", (sum / count));
    }

    // 获取成绩最高的学生
    private static void getTopStudent() {
        if (count == 0) {
            System.out.println("当前无学生信息。");
            return;
        }
        int topIndex = 0;
        for (int i = 1; i < count; i++) {
            if (scores[i] > scores[topIndex]) {
                topIndex = i;
            }
        }
        System.out.print("成绩最高学生 -> ");
        printStudentInfo(topIndex);
    }
}