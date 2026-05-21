package ep5;

public class Fan {
    // 品牌
    private String brand;
    // 状态
    private String status; // ready/working/stop
    // 速度
    private int speed;
    // 通电状态
    private boolean isPoweredOn;

    public Fan(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.isPoweredOn = false;
        this.status = "stop";
    }

    public void togglePower() {
        this.isPoweredOn = !this.isPoweredOn;
        updateStatus();
    }

    public void speedUp() {
        if (speed < 3) {
            this.speed++;
            updateStatus();
        } else {
            System.out.println("已是最高挡位了！");
        }
    }

    public void speedDown() {
        if (speed > 0) {
            this.speed--;
            updateStatus();
        }else {
            System.out.println("已是最低挡位了！");
        }
    }

    public void updateStatus() {
        if (!isPoweredOn) {
            this.status = "stop";
        } else {
            if (speed == 0) {
                this.status = "ready";
            } else {
                this.status = "working";
            }
        }
    }

    public void printInfo() {
        System.out.println("当前 " + brand + " 风扇状态: " + status + ", 速度档位: " + speed);
    }

    public static void main(String[] args) {
        // 创建一个电风扇对象，用 f 表示
        Fan f = new Fan("美的");
        // 加速一次电风扇
        f.speedUp();
        // 向控制台输出 f 的状态和速度
        f.printInfo();

        // 启动电风扇(调用对象的开关方法)
        f.togglePower();
        // 向控制台输出 f 的状态和速度
        f.printInfo();

        // 连续加速 4 次
        for(int i=0; i<4; i++) f.speedUp();
        // 向控制台输出 f 的状态和速度
        f.printInfo();

        // 连续减速 4 次
        for(int i=0; i<4; i++) f.speedDown();
        // 向控制台输出 f 的状态和速度
        f.printInfo();

        // 关掉电风扇
        f.togglePower();
        // 连续加速 2 次
        f.speedUp();
        f.speedUp();
        // 向控制台输出 f 的状态和速度
        f.printInfo();
    }
}
