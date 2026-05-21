package ep52.task3;

public class TestEmployee {

    public static void main(String[] args) {

        Employee.setCompanyName("哇为");

        Employee e1 = new Employee(
                "E001",
                "张三",
                8000,
                2022
        );

        Employee e2 = new Employee();

        e1.displayInfo();

        System.out.println("----------------");

        e2.displayInfo();

        System.out.println("----------------");

        Employee.showTotalEmployees();
    }
}