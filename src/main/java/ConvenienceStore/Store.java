package ConvenienceStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private List<Product> productList;
    private List<Cashier> cashierList;

    private double storeBalance;

    public Store(String name, double storeBalance) {
        this.name = name;
        this.storeBalance = storeBalance;
        this.productList = new ArrayList<>();
        this.cashierList = new ArrayList<>();

    }

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        this.productList.add(product);
    }

    public double getStoreBalance() {
        return storeBalance;
    }

    public void setStoreBalance(double storeBalance) {
        this.storeBalance = storeBalance;
    }

    public List<Cashier> getCashierList() {
        return cashierList;
    }

    public void setCashierList(Cashier cashier) {
        this.cashierList.add(cashier);
    }
}

