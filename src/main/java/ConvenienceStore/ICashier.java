package ConvenienceStore;

public interface ICashier {

    void updateProductQuantity(Product product, int quantity);


    void confirmItemToPay(Customer customer);
}


