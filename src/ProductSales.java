public class ProductSales extends Product implements Sales {

    int qnty;
    double price;

    public ProductSales(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Product: " + name + "\nSales (USD): " + resultSale;
    }

    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }
}