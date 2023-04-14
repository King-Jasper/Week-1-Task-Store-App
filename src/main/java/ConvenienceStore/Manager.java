package ConvenienceStore;

import javax.swing.*;
import java.util.List;


public class Manager extends Staff implements IManager{

    private Store store;

    public Manager(String name, String staffID, Store store) {
        super(name, staffID);
        this.store = store;
    }

@Override
    public void hireCashier(Cashier cashier) {
        store.setCashierList(cashier);
        System.out.println(cashier.getName() + "is already hired by me");
        System.out.println();

    }
@Override
    public void fireCashier(Cashier cashier) {
        List<Cashier> cashiers = store.getCashierList();
        for (Cashier cashier1 : cashiers) {
            if (cashier1.getName().equals((cashier.getName()))) {
                cashiers.remove(cashier1);
                System.out.println("You are fired with immediate effect" + cashier.getName() + " " + "with Staff ID:");
            } else {
                System.out.println(cashier.getName() + "appointment has been terminated");
            }
        }
    }

    public void addProductToStore(Product product) {
        store.setProductList(product);
    }

    public double getBalance() {
        return store.getStoreBalance();
    }

    public List<Product> getProductList() {
        return store.getProductList();
    }
}






