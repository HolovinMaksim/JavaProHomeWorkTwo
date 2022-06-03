import java.util.Scanner;

public class Main {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductSales product;
    static MerchantBonus merchantA;
    static String infoMerchant;
    static String infoProduct;

    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }

    private static void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter merchant name: ");
        merchantName = scanner.nextLine();
        System.out.print("Enter merchant phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter merchant email: ");
        email = scanner.nextLine();
        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter product price: ");
        price = scanner.nextDouble();
    }

    private static String processData() {
        merchantA = new MerchantBonus(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductSales(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
        return infoMerchant + infoProduct + "\nBonus (USD): " + roundBonus;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}