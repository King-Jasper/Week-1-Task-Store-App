package ConvenienceStore;

import java.util.ArrayList;

public class Customer implements ICustomer{
    private String name;
    private double walletBalance;
    private ArrayList<Product> cart;


    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.cart = new ArrayList<>();
    }

    public String getName() {

        return name;
    }
    @Override

    public void makePayment(double amount) {
        this.walletBalance -= amount;
        System.out.println("You have been debited!" + "$"  + amount);
        System.out.println("Balance:" + "$"+ walletBalance);

    }

    @Override
    public double getWalletBalance() {
        System.out.println("Balance" + "$"+ walletBalance);
        return walletBalance;
    }

    @Override
    public void addToCart(Product product, Integer quantity) {
        Product selectedProduct = new Product(product.getName(), product.getPrice(), quantity);
        cart.add(selectedProduct);
        System.out.println(name  + selectedProduct.getName() + "To their cart");

    }

    public ArrayList<Product> getCart() {
        return cart;
    }
}