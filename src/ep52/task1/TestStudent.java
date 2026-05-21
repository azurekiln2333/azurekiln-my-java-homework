package ep52.task1;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(
                "202503038310",
                "张三",
                20,
                97
        );
        s1.showInfo();

        System.out.println("----------------");
        Student s2 = new Student();
        s2.showInfo();

        System.out.println("----------------");
        Student s3 = new Student("2025002");
        s3.showInfo();
        System.out.println("----------------");

        s1.setAge(150);
        s1.setScore(120);
    }
}
