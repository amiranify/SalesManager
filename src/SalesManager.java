public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long cropAverage() {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        long cropAverage = (sum - (max() + min())) / (sales.length - 2);
        return cropAverage;
    }

}
