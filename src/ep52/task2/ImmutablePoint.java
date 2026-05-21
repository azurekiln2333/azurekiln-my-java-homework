package ep52.task2;

public class ImmutablePoint {
    private final double x;
    private final double y;

    // 构造方法
    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // 计算liangdian距离
    public double distance(ImmutablePoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
