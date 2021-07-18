public class Product {
    private String name;
    private int stockLevel;
    private double price;

    public Product(String nameIn, int stockLevelIn, double priceIn) {
        name = nameIn;
        stockLevel = stockLevelIn;
        price = priceIn;
    }

    public double buyStock(int stockLevelIn) {
        stockLevel = stockLevelIn;
        stockLevel = stockLevel - 1;

        return stockLevel;
    }

    public double sell(int stockLevelIn) {
        stockLevel = stockLevelIn;
        stockLevel = stockLevel + 1;
        return stockLevel;
    }

    public void setPrice(double priceIn) {
        price = priceIn;
    }

    public String getName() {
        return name;
    }

    public int getStocklevel() {
        return stockLevel;
    }

    public double getPrice() {
        return price;
    }
}
