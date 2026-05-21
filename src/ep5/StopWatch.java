package ep5;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();

    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (this.endTime == 0 || this.endTime < this.startTime) {
            return System.currentTimeMillis() - this.startTime;
        } else {
            return this.endTime - this.startTime;
        }
    }
}
