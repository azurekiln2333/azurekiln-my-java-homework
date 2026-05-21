package ep5;

// 股票类
public class Stock {
    // 股票代号
    private String symbol;
    // 股票名称
    private String stockName;
    // 前一交易日的股票价格
    private double previousClosingPrice;
    // 当前股票价格
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.stockName = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // 设置当前价格
    public void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
