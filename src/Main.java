public class Main {
    public static void main(String[] args) {
        int[] sales = {20, 500, 300, 10, 1000, 2000, 5000};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
