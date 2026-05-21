package ep5;

import java.util.Date;

public class Account {
    // 唯一性标识
    private String id;
    // 用户名
    private String name;
    // 开户日期
    private Date openDate;
    // 密码
    private String password;
    // 余额
    private double balance;

    public Account(String id, String name) {
        this(id, name, 0.0);
    }

    public Account(String id, String name, double initialBalance) {
        this.id = id;
        this.name = name;
        this.balance = initialBalance;
        this.password = "123456"; // 初始密码
        this.openDate = new Date(); // 开户日期为当前时间
    }

    // 存款
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存款: " + amount + "，当前余额: " + balance);
        }
    }

    // 取款
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("成功取款: " + amount + "，当前余额: " + balance);
        } else {
            System.out.println("取款失败！");
        }
    }

    public void changePassword(String oldPwd, String newPwd) {
        if (this.password.equals(oldPwd)) {
            if (newPwd.length() == 6 && newPwd.matches("\\d{6}")) {
                this.password = newPwd;
                System.out.println("密码修改成功！");
            } else {
                System.out.println("密码修改失败：新密码必须是6位数字。");
            }
        } else {
            System.out.println("密码修改失败：原密码错误。");
        }
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Date getOpenDate() { return openDate; }
    public double getBalance() { return balance; }
}
