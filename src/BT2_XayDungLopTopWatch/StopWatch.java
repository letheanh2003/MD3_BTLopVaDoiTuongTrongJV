package BT2_XayDungLopTopWatch;


public class StopWatch {
    long startTime, endTime;


    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long end() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long result = this.endTime - this.startTime;
        return result;
    }
}

