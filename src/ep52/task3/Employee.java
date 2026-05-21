package ep52.task3;

public class Employee {

    private String id;
    private String name;
    private double baseSalary;
    private int hireYear;

    private static int totalEmployees = 0;
    private static String companyName = "默认公司";

    // 无参构造
    public Employee() {
        this("E000", "默认员工", 3000, 2024);
    }

    // 全参构造
    public Employee(String id, String name, double baseSalary, int hireYear) {

        setId(id);
        setName(name);
        setBaseSalary(baseSalary);
        setHireYear(hireYear);

        totalEmployees++;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getHireYear() {
        return hireYear;
    }

    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("薪资必须大于0！");
        }
    }

    public void setHireYear(int hireYear) {
        if(hireYear >= 1900 && hireYear <= 2026) {
            this.hireYear = hireYear;
        } else {
            System.out.println("入职年份不合法！");
        }
    }

    // 年收入
    public double getAnnualIncome() {
        return baseSalary * 12;
    }

    // 显示信息
    public void displayInfo() {
        System.out.println("公司：" + companyName);
        System.out.println("编号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("月薪：" + baseSalary);
        System.out.println("年收入：" + getAnnualIncome());
        System.out.println("入职年份：" + hireYear);
    }

    // 静态方法
    public static void showTotalEmployees() {
        System.out.println("员工总人数：" + totalEmployees);
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
}