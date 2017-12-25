package moduleTwice.labwork217.labwork4;

public class MySumCount implements Runnable {
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;

    public MySumCount(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        long tempSum = 0;
        for (int i = startIndex; i < stopIndex + 1; i++) {
            tempSum += array[i];
        }
        this.resultSum = tempSum;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}

