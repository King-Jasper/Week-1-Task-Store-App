package ConvenienceStore;

import java.util.ArrayList;

public class Cashier extends Person implements ICashier {

    private String staffID;
    private Store store;


    public Cashier (String name, String staffID, Store store) {
        super(name);
        this.staffID = staffID;
        this.store = store;

    }

    public String getStaffID() {
        return staffID;
    }
@Override
    public void updateProductQuantity(Product product, int quantity) {
        for (Product storeProduct : store.getProductList()) {
            if (storeProduct.getName().equals(product.getName())) {
                storeProduct.setQuantity(storeProduct.getQuantity() - quantity);
                break;
            }
        }
    }

    //Updating the customer's cart, the quantity of item picked and the customer payment.
    @Override
    public void confirmItemToPay(Customer customer) {
        double total = 0.0;
        System.out.println();
        for (Product item : customer.getCart()) {
            System.out.println("item picked: " + item.getName() + "Qty:" + item.getQuantity());
            total += item.getPrice() * item.getQuantity();
            updateProductQuantity(item, item.getQuantity());

        }
        System.out.println("Cart Total:" + total);
        // To check customers wallet balance and deduct his money after payment
        if (customer.getWalletBalance() >= total) {
            customer.makePayment(total);
            store.setStoreBalance(store.getStoreBalance() + total);
            signReceipt(customer, customer.getCart(), total);
        } else {
            System.out.println("Payment can not be Completed due to insufficient fund");
        }
        //To check customers wallet balance and deduct his money after payment
    }

    private void signReceipt (Customer customer, ArrayList < Product > products, double total){
        System.out.println();
        System.out.println("Receipt");
        System.out.println("Name:" + customer.getName());
        for (Product item : products)
            System.out.println(item.toString());
        System.out.println("Total: " + total);
        customer.getCart().clear();
    }
}