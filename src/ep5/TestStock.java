package ep5;

public class TestStock {
    public static void main(String[] args) {
        // 创建一个Stock
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);

        System.out.println("股票代号: " + stock1.getSymbol());
        System.out.println("股票名称: " + stock1.getStockName());
        System.out.println("前一日收盘价: " + stock1.getPreviousClosingPrice());
        System.out.println("当前价格: " + stock1.getCurrentPrice());
        System.out.printf("价格变动百分比: %.2f%%\n", stock1.getChangePercent());
    }
}
