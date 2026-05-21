package ep52.task1;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double score;

    // 无参构造
    public Student() {
        this(generateRandomStuId(), "默认姓名", 18, 0);
    }

    // 单参构造
    public Student(String studentId) {
        this(studentId, "待录入", 18, 0);
    }

    // 全参构造
    public Student(String studentId, String name, int age, double score) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setScore(score);
    }

    // getter
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    // setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不合法！");
        }
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("成绩不合法！");
        }
    }

    // 打印所有信息
    public void showInfo() {
        System.out.println("学号：" + studentId + "\n"
                + "姓名：" + name + "\n"
                + "年龄：" + age + "\n"
                + "成绩：" + score);
    }

    // 随机生成学生唯一标识
    private static String generateRandomStuId() {
        int num = (int) (Math.random() * 9000) + 1000;
        return "stu" + num;
    }
}
